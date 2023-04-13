package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString(callSuper = true)

public class Buterfly extends Insect {
    private final int lengthOfStingInMillimeters;
    private boolean isFemale;
    private boolean isBloodSucker;

    public Buterfly(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isFemale, boolean isBloodSucker,int lengthOfStingInMillimeters) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasWings = hasWings;
        this.isDangerous = isDangerous;
        this.isFemale = isFemale;
        this.isBloodSucker = isBloodSucker;
        this.lengthOfStingInMillimeters = lengthOfStingInMillimeters;
    }

    @Override
    public String toCSV() {
        return String.format(name, numberOfLegs, hasWings, isDangerous, isFemale, isBloodSucker, lengthOfStingInMillimeters);
    }

    @Override
    public String getHeaders() {

        return "Butterfly, 6, true, false, true, false, 10";
    }

    @Override
    public boolean canInjectPoison() {

        return false;
    }

    @Override
    public boolean surviveOverWinter() {

        System.out.println("Buterfly hibernate in the winter");
        return false;
    }
}
