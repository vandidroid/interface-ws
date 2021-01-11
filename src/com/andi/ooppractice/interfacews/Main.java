package com.andi.ooppractice.interfacews;

public class Main {

    public static void main(String[] args) {
	    Flying[] animals = new Flying[4];

	    animals[0] = new Bird("cinege", true);
	    animals[1] = new Bird("sas", false);
	    animals[2] = new Ladybird("katica", true);
	    animals[3] = new Ladybird("katica2",false);

	    fly(animals);
    }

    public static void fly(Flying[] animals){
        for (int i= 0; i < animals.length; i++){
            animals[i].fly();

        }
    }

    public static void feed(Flying[] animals){
        for (int i= 0; i < animals.length; i++){
            ((Feeding)animals[i]).feed();
        }
    }
}
