package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnWebApplication//web应用才生效
@EnableConfigurationProperties(MyAppProperties.class)//让属性文件生效
@Configuration//声明是一个配置类
public class MyAppServiceAutoConfiguration {

    @Autowired
    private MyAppProperties myAppProperties;

    @Bean
    public MyAppService myAppService() {
        MyAppService myAppService = new MyAppService();
        myAppService.setMyAppProperties(myAppProperties);
        return myAppService;
    }
}
