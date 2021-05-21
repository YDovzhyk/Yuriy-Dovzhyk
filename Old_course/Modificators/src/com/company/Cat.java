package com.company;


    public class Cat {

        String name;
        int age;

        public static void main(String[] args) {
            Cat barsik = new Cat();
            barsik.age = 3;
            barsik.name = "Барсик";

            System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        }

    }

