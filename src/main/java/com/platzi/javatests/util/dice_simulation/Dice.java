package com.platzi.javatests.util.dice_simulation;

import java.util.Random;

public class Dice {

    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    /*Devolvemos un numero aleatoriamente*/
    public int roll(){
        return new Random().nextInt(sides) + 1;
    }

}
