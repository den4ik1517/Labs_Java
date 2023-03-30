package ua.lviv.iot.algo.part1.lab1;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public abstract class Insect {
    protected String name;
    protected int numberOfLegs;
    protected boolean hasWings = false;
    protected boolean isDangerous = false;

    protected abstract boolean canInjectPoison();

    public abstract void surviveOverWinter();
}



