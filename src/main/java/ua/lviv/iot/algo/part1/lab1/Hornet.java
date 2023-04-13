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
    public String toCSV() {
        return String.format(name, numberOfLegs, hasWings, isDangerous, lengthOfStingInMillimeters);
    }

    @Override
    public String getHeaders() {

        return "Hornet, 6, true, true, 5";
    }

    @Override
    public boolean canInjectPoison() {

        return true;
    }

    @Override
    public boolean surviveOverWinter() {

        System.out.println("Hornets survive the winter by hibernating in small nests.");
        return false;
    }
}
