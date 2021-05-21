package com.company;

public class Cat {
    // поля, или переменными экземпляров
    private String name; //Лучше закрывать доступ к переменным private, но чтобы они были доступны для других, нужно создать геттеры и сеттеры
    private int age;     // нужно указать какого типа будет переменная
    static int count = 0; //Обязательно static Это значит, что она принадлежит классу, а не конкретному объекту класса


    public Cat(String name, int age) {  // Конструктор для наших переменных
        this.name = name;
        this.age = age;
    }

    public Cat() { // коструктор для уличных котов (когда мы не знаем его имени и возраста
        count++; //В конструкторе можно присваивать значения и явно, а не только брать их из аргументов. Например, мы можем записывать всех уличных котов в базу данных под именем "Уличный кот номер..." :
        this.name = "Уличный кот номер " + count;
    }

    public String getName() { // Геттеры и сеттеры Позволяют получать переменные в других классах пакета (лучше их всегда создавать)
        return name;
    }

    public void setName(String name) { // Позволяют редактировать переменные в других классах пакета
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { //сеттер — это полноценный метод. А в метод, в отличие от поля, мы можем заложить необходимую логику проверки
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public void sayMeow() { //То что умеет наш объект
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }


    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 3);
        barsik.age = 3;
        barsik.name = "Барсик";
        count++;

        Cat vasia = new Cat("Вася", 5);
        vasia.age = 5;
        vasia.name = "Вася";
        count++;

        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        barsik.sayMeow();
        barsik.jump();

        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);
        barsik.sayMeow();
        barsik.jump();

        Cat streetCat1 = new Cat();
        Cat streetCat2 = new Cat();
        System.out.println(streetCat1.name);
        System.out.println(streetCat2.name);

        System.out.println("Общее количество котов = " + count);
    }


    public class Main { // Теперь доступ к переменным есть в другом классе

        public void main(String[] args) {


            Cat barsik = new Cat("Барсик", 3);
            String barsikName = barsik.getName();
            int barsikAge = barsik.getAge();

            System.out.println("Имя кота: " + barsikName);
            System.out.println("Возраст кота: " + barsikAge);


            Cat vacia = new Cat("Вася", 5); // Также мы можем изменить праматры
            System.out.println("Изначальное имя кота — " + vacia.getName());
            barsik.setName("Василий");
            System.out.println("Новое имя кота — " + vacia.getName());

        }
    }
}



