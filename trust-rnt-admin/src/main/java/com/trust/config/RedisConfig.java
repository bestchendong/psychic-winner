package com.trust.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.listener.PatternTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.data.redis.listener.adapter.MessageListenerAdapter;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;


/**
 * Redis缓存配置类
 * @author chendd
 *
 */
@Configuration
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport{


    //自定义缓存key生成策略
//    @Bean
//    public KeyGenerator keyGenerator() {
//        return new KeyGenerator(){
//            @Override
//            public Object generate(Object target, java.lang.reflect.Method method, Object... params) {
//                StringBuffer sb = new StringBuffer();
//                sb.append(target.getClass().getName());
//                sb.append(method.getName());
//                for(Object obj:params){
//                    sb.append(obj.toString());
//                }
//                return sb.toString();
//            }
//        };
//    }
    //缓存管理器
    @Bean
    public CacheManager cacheManager(@SuppressWarnings("rawtypes") RedisTemplate redisTemplate) {
        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        //设置缓存过期时间
        cacheManager.setDefaultExpiration(10000);
        return cacheManager;
    }
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory)
    {
        Jackson2JsonRedisSerializer<Object> jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer<Object>(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        jackson2JsonRedisSerializer.setObjectMapper(om);
        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
        template.setConnectionFactory(redisConnectionFactory);
        template.setKeySerializer(jackson2JsonRedisSerializer);
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.setHashKeySerializer(jackson2JsonRedisSerializer);
        template.setHashValueSerializer(jackson2JsonRedisSerializer);
        template.afterPropertiesSet();
        return template;
    }
//    @Bean
//    RedisMessageListenerContainer container(RedisConnectionFactory connectionFactory,
//                                            MessageListenerAdapter listenerAdapter) {
//
//        RedisMessageListenerContainer container = new RedisMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory);
//        //订阅了一个叫chat 的通道
//        container.addMessageListener(listenerAdapter, new PatternTopic("rnt"));
//        //这个container 可以添加多个 messageListener
//        return container;
//    }
//
//    @Bean
//    MessageListenerAdapter listenerAdapter(MessageReceiver receiver) {
//        //这个地方 是给messageListenerAdapter 传入一个消息接受的处理器，利用反射的方法调用“receiveMessage”
//        //也有好几个重载方法，这边默认调用处理器的方法 叫handleMessage 可以自己到源码里面看
//        return new MessageListenerAdapter(receiver, "receiveMessage");
//    }
//
//    /**redis 读取内容的template 这边跟本工程无关，可以不配置*/
//    @Bean
//    StringRedisTemplate template(RedisConnectionFactory connectionFactory) {
//        return new StringRedisTemplate(connectionFactory);
//    }

}