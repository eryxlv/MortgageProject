package com.company;

import com.company.Animal.Cat;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("mruczek");
        Cat cat2 = new Cat("kradnie mleko z lodówki");
        System.out.println(cat1.givemeVoice());
        System.out.println(cat2.givemeVoice());

        System.out.println("Cat 1: " + cat1.getName());
        System.out.println("Cat 2: " + cat2.getName());

        cat1.setName("kiciek");
        cat2.setName("kradnie mleko z piwnicy");

        System.out.println("Cat 1: " + cat1.getName());
        System.out.println("Cat 2: " + cat2.getName());


    }
}