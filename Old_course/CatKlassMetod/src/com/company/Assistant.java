package com.company;
// Запись (String...names) переданная в качестве параметра позволяет нам указать,
// что в метод передается какое-то количество строк. Мы не оговариваем заранее, сколько их должно быть,
// поэтому работа нашего метода становится теперь намного более гибкой:

public class Assistant {
    
    public static void sayHi(String... names) {

        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        Assistant assistant = new Assistant();
        Assistant.sayHi("Тони Старк", "Капитан Америка", "Черная Вдова", "Халк");
    }
}

