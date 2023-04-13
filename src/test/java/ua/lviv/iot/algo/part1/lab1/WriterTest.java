package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class WriterTest {

    @Test
    void writeCSV() throws IOException {
        try (FileReader expectedReader = new FileReader("src/main/resources/expected.csv");
             BufferedReader expectedBR = new BufferedReader(expectedReader);
             FileReader actualReader = new FileReader("src/main/resources/result.csv");
             BufferedReader actualBR = new BufferedReader(actualReader)) {
            String line1 = expectedBR.readLine();
            String line2 = actualBR.readLine();
            Assertions.assertEquals(line1, line2);
        }
    }
}