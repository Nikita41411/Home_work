package edu.praktikum.sprint3.collections;

import edu.praktikum.sprint3.models.Soyuz;

import java.util.*;

public class Maps {

    public static void main(String[] args) {
        Soyuz soyuz1 = new Soyuz(2);
        Soyuz soyuz2 = new Soyuz(2);

        System.out.println(Objects.equals(soyuz1, soyuz2));


        Map<Integer, String> map = new HashMap<>();

        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(1, "точно один");

        System.out.println(map);

        System.out.println(map.get(2));

        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        Map<String, List<Double>> m = new HashMap<>();


        Map<Soyuz, String> shipsMap = new HashMap<>();
        shipsMap.put(soyuz1, "Союз 1");
        shipsMap.put(soyuz2, "Союз 2");

        System.out.println();
        System.out.println(shipsMap);
    }
}
