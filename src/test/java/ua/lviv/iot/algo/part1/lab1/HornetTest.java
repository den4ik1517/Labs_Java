package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HornetTest {

    @Test
    void canInjectPoison() {
        var hornet = new Hornet("Hornet", 6, true, true, 5);

        assertTrue(hornet.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        var hornet = new Hornet("Hornet", 6, true, true, 5);

        assertFalse(hornet.surviveOverWinter());

    }
}