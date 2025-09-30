package edu.praktikum.sprint3.collections;

import java.util.*;

public class Sets {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("avj");
        list.add("c");
        list.add("B102");
        list.add("c");
        list.add("10");

        Set<String> set = new HashSet<>(list);

        System.out.println("List: " + list);
        System.out.println();
        System.out.println("Set: " + set);

        Set<String> linkedSet = new LinkedHashSet<>(list);

        Set<String> treeSet = new TreeSet<>(list);

        System.out.println("LinkedHashSet: " + linkedSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
