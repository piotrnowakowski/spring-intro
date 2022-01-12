package com.example;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomTextMessageService implements MessageService{
    ArrayList<String> lista = new ArrayList<String>(){{
        add("m1");
        add("m2");
        add("m3");
        add("m4");
        add("m5");
        add("m6");
        add("m7");
        add("m8");
        add("m9");
        add("m10");
    }};

    @Override
    public String getMessage() {
        int liczba = new Random().nextInt(9 + 1);
        return this.lista.get(liczba);
    }
}
