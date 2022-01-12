package com.example;

import org.springframework.stereotype.Component;

@Component("messageService")
public class MyNameMessageService implements MessageService {

    @Override
    public String getMessage() {
        String expectedMessage = "Piotr Nowakowski";
        return expectedMessage;
    }

}
