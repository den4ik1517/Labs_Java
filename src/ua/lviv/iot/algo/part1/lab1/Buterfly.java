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
    public boolean canInjectPoison() {

        return false;
    }

    @Override
    public void surviveOverWinter() {

        System.out.println("Buterfly hibernate in the winter");
    }
}
