package com.andi.ooppractice.interfacews;

public class Ladybird implements Flying, Feeding {
    protected String name;
    protected boolean isFemale;

    public Ladybird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    public void speak() {
        System.out.println("What a wonderful worm");
    }

    @Override
    public void feed() {
      speak();
    }

    @Override
    public void fly() {
        System.out.println("Buzz,Buzz");

    }
}
