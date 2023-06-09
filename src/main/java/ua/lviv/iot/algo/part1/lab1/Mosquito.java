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
    public String toCSV() {
        return String.format(name, numberOfLegs, hasWings, isDangerous, isFemale, isBloodSucker);
    }

    @Override
    public String getHeaders() {

        return "Mosquito, 6, true, true, true, true";
    }

    @Override
    public boolean canInjectPoison() {

        return true;
    }

    @Override
    public boolean surviveOverWinter() {

        System.out.println("Mosquitoes hibernate in the winter.");
        return false;
    }
}
