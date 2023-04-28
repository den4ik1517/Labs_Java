package ua.lviv.iot.algo.part1.lab1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Writer {
    public static void writeCSV() throws IOException {
        try (FileWriter writer = new FileWriter("src/main/resources/result.csv")) {
            String previousClassName = "";
            ArrayList<Insect> insects = new ArrayList<>();
            insects.add(new Mosquito("Mosquito", 6, true, true, true, true));
            insects.add(new Hornet("Hornet", 6, true, true, 5));
            insects.add(new Bee("Bee", 6, true, false, true, false));
            insects.add(new Buterfly("Buterfly", 6, true, false, true, false, 10));

            for (var insect : insects) {
                if (!insect.getClass().getSimpleName().equals(previousClassName)) {
                    writer.write(insect.getHeaders());
                    writer.write("\r\n");
                    previousClassName = insect.getClass().getSimpleName();
                }

                writer.write(insect.toCSV());
                writer.write("\r\n");


            }
        }
    }
}
