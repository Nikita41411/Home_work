package edu.praktikum.sprint3.collections;

import edu.praktikum.sprint3.models.Proton;
import edu.praktikum.sprint3.models.Soyuz;
import edu.praktikum.sprint3.models.SpaceShip;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("c");
        list.add("B102");

        System.out.println(list);
        System.out.println(list.get(0));

        list.remove(1);
        System.out.println(list);

        List<SpaceShip> ships = new ArrayList<>();
        ships.add(new Soyuz(2));
        ships.add(new Soyuz(3));
        ships.add(new Proton(4));

        System.out.println(ships);

        ships.add(1, new Proton(100));

        System.out.println(ships);

        /**
         *
         * [ 0, 1, 2, ...., n ]
         *
         * [ 0, 1, 2, .., NEW, .., n ]
         *
         */

        List<SpaceShip> linkedList = new LinkedList<>();

        list.add(2, "ds");

        /**
         *
         * null<-(0)-> <-(1)-> <-(2)-> ... <-(n)->null
         *
         * null<-(0)-> <-(1)->  <-(NEW)->  <-(2)-> ... <-(n)->null
         *
         */
    }
}
