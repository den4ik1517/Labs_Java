package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Insect {
    private String name;
    private int numberOfLegs;
    private boolean hasWings;

    private static Insect instance = new Insect();

    private boolean isDangerous;
    private boolean isSleeping;

    public static Insect getInstance() {

        return instance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getNumberOfLegs() {

        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {

        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasWings() {

        return hasWings;
    }

    public void setHasWings(boolean hasWings) {

        this.hasWings = hasWings;
    }

    public boolean isDangerous() {

        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {

        isDangerous = dangerous;
    }

    public boolean isSleeping() {

        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {

        isSleeping = sleeping;
    }

    public boolean isPoisonous() {

        return false;
    }

    public void hibernate() {

        isSleeping = true;
    }

    public void wakeUp() {

        isSleeping = false;
    }

    public static void main(String... args) {
        Insect[] insects = {
                new Insect(),
                new Insect("Bee", 6, true, true, false),
                Insect.getInstance(),
                Insect.getInstance(),
        };

        for (Insect insect : insects) {
            System.out.println(insect);
        }
    }
}