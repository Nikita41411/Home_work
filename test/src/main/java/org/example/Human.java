package org.example;

public class Human {

    private String name;
    private int age;

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Имя не может быть пустым");
            return;
        } else {
        this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Возраст не может быть отрицательным или 0");
            return;
        } else {
        this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    void speak(){
        if (name == null || age <= 0){
            System.out.println("Ошибка");
        } else {
        System.out.println("Тебя зовут "+name+", тебе "+age+" лет");
        }
    }
}
