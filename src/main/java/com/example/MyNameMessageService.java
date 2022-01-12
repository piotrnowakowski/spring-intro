package com.example;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyNameMessageService implements MessageService {
    @Bean
    @Override
    public String getMessage() {
        String expectedMessage = "Piotr Nowakowski";
        return expectedMessage;
    }

}
