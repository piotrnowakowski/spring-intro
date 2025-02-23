package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        MessageService messageService = applicationContext.getBean("messageService", MessageService.class);
        MessageService messageService2 = applicationContext.getBean("messageService2", MessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println("hash jeden " + messageService.hashCode());
        System.out.println("hash jeden " + messageService2.hashCode());

        applicationContext.close();
    }
}
