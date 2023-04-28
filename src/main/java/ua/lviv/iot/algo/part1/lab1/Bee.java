package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)

public class Bee extends Insect {
    private boolean isFemale;
    private boolean isBloodSucker;

    public Bee(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isFemale, boolean isBloodSucker) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasWings = hasWings;
        this.isDangerous = isDangerous;
        this.isFemale = isFemale;
        this.isBloodSucker = isBloodSucker;
    }

    @Override
    public String toCSV() {
        return String.format(name, numberOfLegs, hasWings, isDangerous, isFemale, isBloodSucker);
    }

    @Override
    public String getHeaders() {

        return "Bee, 6, true, false, true, false";
    }

    @Override
    public boolean canInjectPoison() {

        return false;
    }

    @Override
    public boolean surviveOverWinter() {

       return false;
    }
}
