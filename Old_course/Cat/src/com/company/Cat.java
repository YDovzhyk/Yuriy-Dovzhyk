package com.company;

public class Cat {

    String name;
    int age;

    static int count = 0;

    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Cat kirabo = new Cat();
        kirabo.age = 7;
        kirabo.name = "Кирабо";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + kirabo.name + ", его возраст - " + kirabo.age);

        System.out.println(count);

    }
}
