package com.trust.config;

import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * @Author Yangcb
 * @Descrintion 图片验证码集成属性设置
 * @Date create 2018-01-29 10:50
 * @Version 1.0
 */
@Configuration
public class CaptchaConfig {
    @Bean(name="captchaProducer")
    public DefaultKaptcha getKaptchaBean(){
        DefaultKaptcha defaultKaptcha=new DefaultKaptcha();
        Properties properties=new Properties();
        properties.setProperty("kaptcha.border", "yes");
        properties.setProperty("kaptcha.border.color", "105,179,90");
        properties.setProperty("kaptcha.textproducer.font.color", "blue");
        properties.setProperty("kaptcha.image.width", "100");
        properties.setProperty("kaptcha.image.height", "40");
        properties.setProperty("kaptcha.session.key", "code");
        properties.setProperty("kaptcha.textproducer.font.size", "30");
        properties.setProperty("kaptcha.textproducer.char.length", "4");
        properties.setProperty("kaptcha.textproducer.font.names", "宋体,楷体,微软雅黑");
        //properties.setProperty("kaptcha.obscurificator.impl","com.trust.config.KaptchText");//图片样式
        properties.setProperty("kaptcha.obscurificator.impl","com.google.code.kaptcha.impl.ShadowGimpy");//图片样式
        properties.setProperty("kaptcha.background.clear.from","211,211,211");//背景颜色渐变，开始颜色
        properties.setProperty("kaptcha.background.clear.to","white");//背景颜色渐变， 结束颜色
        properties.setProperty("kaptcha.noise.impl","com.trust.config.CaptchaNoise");//干扰实现
        properties.setProperty("kaptcha.textproducer.impl","com.trust.config.KaptchText");//字体自定义实现
        Config config=new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }

}
