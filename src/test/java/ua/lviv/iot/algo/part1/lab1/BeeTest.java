package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BeeTest {

    @Test
    void canInjectPoison() {
        var bee = new Bee("Bee", 6, true, false, true, false);

        assertFalse(bee.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        var bee = new Bee("Bee", 6, true, false, true, false);

        assertFalse(bee.surviveOverWinter());
    }

    @Test
    void isFemale() {
        var bee = new Bee("Bee", 6, true, false, true, false);

        assertTrue(bee.isFemale());
    }

    @Test
    void isBloodSucker() {
        var bee = new Bee("Bee", 6, true, false, true, false);

        assertFalse(bee.isBloodSucker());
    }
}