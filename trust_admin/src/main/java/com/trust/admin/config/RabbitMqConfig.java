package com.trust.config;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.RabbitProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Author Yangcb
 * @Descrintion rabbitmq配置
 * @Date create 2017-11-24 16:43
 * @Version 1.0
 */
@Configuration
public class RabbitMqConfig {
    @Value("${mq.rabbit.username}")
    private String name;
    @Value("${mq.rabbit.password}")
    private String password;
    @Value("${mq.rabbit.host}")
    private String host;
    @Value("${mq.rabbit.port}")
    private int port;
    @Value("${mq.rabbit.virtualHost}")
    private String virtualHost;

    @Bean(name="connectFactory")
    @Primary
    public CachingConnectionFactory ConnectFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setUsername(name);
        connectionFactory.setPassword(password);
        connectionFactory.setVirtualHost(virtualHost);
        connectionFactory.setPort(port);
        connectionFactory.setHost(host);
        return connectionFactory;
    }

    @Bean(name="uRabbitListenerContainerFactory")
    public SimpleRabbitListenerContainerFactory uRabbitListenerContainerFactory(
            @Qualifier("connectFactory") ConnectionFactory connectionFactory,
            RabbitProperties config
    ) {
        SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        RabbitProperties.Listener listenerConfig = config.getListener();
        factory.setAutoStartup(listenerConfig.isAutoStartup());
        if (listenerConfig.getAcknowledgeMode() != null) {
            factory.setAcknowledgeMode(listenerConfig.getAcknowledgeMode());
        }
        if (listenerConfig.getConcurrency() != null) {
            factory.setConcurrentConsumers(listenerConfig.getConcurrency());
        }
        if (listenerConfig.getMaxConcurrency() != null) {
            factory.setMaxConcurrentConsumers(listenerConfig.getMaxConcurrency());
        }
        if (listenerConfig.getPrefetch() != null) {
            factory.setPrefetchCount(listenerConfig.getPrefetch());
        }
        if (listenerConfig.getTransactionSize() != null) {
            factory.setTxSize(listenerConfig.getTransactionSize());
        }
        return factory;
    }

    @Bean(name="uAmqpAdmin")
    public AmqpAdmin amqpAdmin(@Qualifier("connectFactory") ConnectionFactory connectionFactory) {
        RabbitAdmin admin = new RabbitAdmin(connectionFactory);
        admin.setAutoStartup(false);
        return admin;
    }
}
