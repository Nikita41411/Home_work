package edu.praktikum.sprint3.collections;

import edu.praktikum.sprint3.models.Proton;
import edu.praktikum.sprint3.models.Soyuz;
import edu.praktikum.sprint3.models.SpaceShip;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(100);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        List<SpaceShip> ships = new ArrayList<>();

        ships.add(new Soyuz(2));
        ships.add(new Proton(2));
        ships.add(new Soyuz(1));
        ships.add(new Proton(5));
        ships.add(new Soyuz(4));
        ships.add(new Soyuz(2));

        System.out.println(ships);

        Collections.sort(ships);
        System.out.println(ships);
    }
}
