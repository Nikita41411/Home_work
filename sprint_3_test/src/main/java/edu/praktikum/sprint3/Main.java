package edu.praktikum.sprint3;

import edu.praktikum.sprint3.models.Proton;
import edu.praktikum.sprint3.models.Soyuz;
import edu.praktikum.sprint3.models.SpaceShip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Soyuz soyuz = new Soyuz(2);
        Proton proton = new Proton(0);

        SpaceShip[] ships = {
                soyuz,
                proton
        };

        List<SpaceShip> shipsList = new ArrayList<>();
        shipsList.add(new Soyuz(2));
        shipsList.add(new Proton(0));

        System.out.println("Массив: " + Arrays.toString(ships));
        System.out.println("Список: " + shipsList);
    }

}
