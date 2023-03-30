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
    public boolean canInjectPoison() {

        return false;
    }

    @Override
    public void surviveOverWinter() {

        System.out.println("Bee lives up to a month");
    }
}
