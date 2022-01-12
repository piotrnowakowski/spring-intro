package com.example;

public class MyNameMessageService implements MessageService {

    @Override
    public String getMessage() {
        String expectedMessage = "Piotr Nowakowski";
        return expectedMessage;
    }

}
