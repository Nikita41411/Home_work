package org.example;

public class Main {
    public static void main(String[] args) {
        Human p1 = new Human("Вася", 21);
        p1.speak();
        Human p2 = new Human("Петя", 14);
        String v = p2.getName();
        String upperCase = v.toUpperCase();
        System.out.printf(upperCase + " ");
        p2.speak();
    }
}