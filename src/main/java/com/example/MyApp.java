package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MessageServiceConfigurator.class);
        RandomTextMessageService messageService = context.getBean(RandomTextMessageService.class);
        RandomTextMessageService messageService2 = context.getBean(RandomTextMessageService.class);
        MyNameMessageService messageService3 = context.getBean(MyNameMessageService.class);

        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
        System.out.println(messageService3.getMessage());
        System.out.println("hash jeden " + messageService.hashCode());
        System.out.println("hash dwa " + messageService2.hashCode());

        context.close();
    }
}
