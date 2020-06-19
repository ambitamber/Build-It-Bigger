package com.example.jokejava;

import java.util.Random;

public class Joke {

    private static final String jokes[]={
            "Talking to a liberal is like trying to explain social media to a 70 years old",
            "Maybe if we start telling people the brain is an app they will start using it",
            "I changed my password to \"incorrect\". So whenever I forget what it is the computer will say \"Your password is incorrect\"",
            "If you were a browser, you'd be called FireFoxy."
    };

    public static String getJoke(){
        int size = jokes.length;
        Random random = new Random();
        int index= random.nextInt(size);
        return jokes[index];
    }
}
