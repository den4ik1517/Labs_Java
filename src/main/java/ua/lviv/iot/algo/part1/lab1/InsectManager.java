package ua.lviv.iot.algo.part1.lab1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InsectManager {

    private List<Insect> insects;

    public InsectManager() {

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

    public static void main(String[] args) {
        List<Insect> insects = new ArrayList<>();
        insects.add(new Mosquito("Mosquito", 6, true, true, true, true));
        insects.add(new Hornet("Hornet", 6, true, true, 5));
        insects.add(new Bee("Bee", 6, true, false, true, false));
        insects.add(new Buterfly("Butterfly", 6, true, false, true, false, 10));

        InsectManager insectManager = new InsectManager();
        insects.forEach(insectManager::addInsect);

        System.out.println("\nInsects with 6 legs:");
        insectManager.findAllWithNumberOfLegs(6).forEach(System.out::println);

        System.out.println("\nInsects with wings:");
        insectManager.findAllWithWings().forEach(System.out::println);
    }
}
