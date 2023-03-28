package com.company.Animal;

public class Cat {

    public Cat(String name){
        this.name = name;
    }

    private String name;

    public String givemeVoice(){
        return "meow";
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}
