package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MosquitoTest {

    @Test
    void canInjectPoison() {
        var mosquito = new Mosquito("Mosquito", 6, true, true, true, true);

        assertTrue(mosquito.canInjectPoison());
    }

    @Test
    void surviveOverWinter() {
        var mosquito = new Mosquito("Mosquito", 6, true, true, true, true);

        assertFalse(mosquito.surviveOverWinter());
    }

    @Test
    void isFemale() {
        var mosquito = new Mosquito("Mosquito", 6, true, true, true, true);

        assertTrue(mosquito.isFemale());
    }

    @Test
    void isBloodSucker() {
        var mosquito = new Mosquito("Mosquito", 6, true, true, true, true);

        assertTrue(mosquito.isBloodSucker());
    }
}