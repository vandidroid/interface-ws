package com.andi.ooppractice.interfacews;

public class Bird implements Flying, Feeding {
    protected String name;
    protected boolean isFemale;

    public Bird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    public void speak() {
        System.out.println("“I love aphid”");
    }

    @Override
    public void feed() {
       speak();
    }

    @Override
    public void fly() {
        System.out.println(" Csájp, Csájp");
    }
}
