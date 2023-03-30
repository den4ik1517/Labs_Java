package ua.lviv.iot.algo.part1.lab1;

import lombok.*;
@Getter
@Setter
@ToString(callSuper = true)

public class Mosquito extends Insect {
    private boolean isFemale;
    private boolean isBloodSucker;

    public Mosquito(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isFemale, boolean isBloodSucker) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasWings = hasWings;
        this.isDangerous = isDangerous;
        this.isFemale = isFemale;
        this.isBloodSucker = isBloodSucker;
    }

    @Override
    public boolean canInjectPoison() {

        return isBloodSucker && isFemale;
    }

    @Override
    public void surviveOverWinter() {

        System.out.println("Mosquitoes hibernate in the winter.");
    }
}
