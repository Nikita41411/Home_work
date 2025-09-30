package org.example;

public class Human {

    private String name;
    private int age;

    public Human(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым или null");
        }
        this.name = name.trim();
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным или 0");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void speak() {
        System.out.println("Тебя зовут " + name + ", тебе " + age + " " + getAgeSuffix(age));
    }

    private String getAgeSuffix(int age) {
        int lastDigit = age % 10;
        int lastTwoDigits = age % 100;

        // Исключение для чисел 11-14
        if (lastTwoDigits >= 11 && lastTwoDigits <= 14) {
            return "лет";
        }

        switch (lastDigit) {
            case 1:
                return "год";
            case 2:
            case 3:
            case 4:
                return "года";
            default:
                return "лет";
        }
    }
}