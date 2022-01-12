package com.example;

import org.springframework.context.annotation.Bean;

public class MessageServiceConfigurator {
    @Bean
    public RandomTextMessageService randomTextMessageService(){
        return new RandomTextMessageService();
    }
    @Bean
    public MyNameMessageService myNameMessageService()
    {
        return new MyNameMessageService();
    }
}
