package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Hornet extends Insect {
    private int lengthOfStingInMillimeters;

    public Hornet(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, int lengthOfStingInMillimeters) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasWings = hasWings;
        this.isDangerous = isDangerous;
        this.lengthOfStingInMillimeters = lengthOfStingInMillimeters;
    }

    @Override
    public boolean canInjectPoison() {

        return true;
    }

    @Override
    public void surviveOverWinter() {

        System.out.println("Hornets survive the winter by hibernating in small nests.");
    }
}
