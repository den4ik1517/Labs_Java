package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ButerflyTest {

    @Test
    void canInjectPoison() {
        var buterfly = new Buterfly("Butterfly", 6, true, false, true, false, 10);

        assertFalse(buterfly.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        var buterfly = new Buterfly("Butterfly", 6, true, false, true, false, 10);

        assertFalse(buterfly.surviveOverWinter());
    }

    @Test
    void isFemale() {
        var buterfly = new Buterfly("Butterfly", 6, true, false, true, false, 10);

        assertTrue(buterfly.isFemale());
    }

    @Test
    void isBloodSucker() {
        var buterfly = new Buterfly("Butterfly", 6, true, false, true, false, 10);

        assertFalse(buterfly.isBloodSucker());
    }
}