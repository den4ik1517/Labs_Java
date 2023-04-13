package ua.lviv.iot.algo.part1.lab1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InsectManager {

    private List<Insect> insects;

    public InsectManager() {
        insects = new ArrayList<>();
    }

    public void addInsect(Insect insect) {

        this.insects = new ArrayList<>();
    }

    public void addInsect(Insect insect) {

        insects.add(insect);
    }

    public List<Insect> findAllWithNumberOfLegs(int numberOfLegs) {
        return insects.stream()
                .filter(insect -> insect.getNumberOfLegs() == numberOfLegs)
                .collect(Collectors.toList());
    }

    public List<Insect> findAllWithWings() {
        return insects.stream()
                .filter(Insect::isHasWings)
                .collect(Collectors.toList());
    }

    public String toCSV() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < insects.size(); i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(insects.get(i).toCSV());
        }
        return sb.toString();
    }

    public String getHeaders() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < insects.size(); i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(insects.get(i).getHeaders());
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
    public static void main(String[] args) {
        List<Insect> insects = new ArrayList<>();
        insects.add(new Mosquito("Mosquito", 6, true, true, true, true));
        insects.add(new Hornet("Hornet", 6, true, true, 5));
        insects.add(new Bee("Bee", 6, true, false, true, false));
        insects.add(new Buterfly("Buterfly", 6, true, false, true, false, 10));
        insects.add(new Buterfly("Butterfly", 6, true, false, true, false, 10));

        InsectManager insectManager = new InsectManager();
        insects.forEach(insectManager::addInsect);

        Writer.writeCSV();

        System.out.println("\nInsects with 6 legs:");
        insectManager.findAllWithNumberOfLegs(6).forEach(System.out::println);

        System.out.println("\nInsects with wings:");
        insectManager.findAllWithWings().forEach(System.out::println);

        System.out.println("\nHeaders:");
        System.out.println(insectManager.getHeaders());

        System.out.println("\nCSV:");
        System.out.println(insectManager.toCSV());
    }
}

    }
}
