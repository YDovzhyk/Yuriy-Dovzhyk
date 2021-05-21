package com.company;
// RandomNumberGame
import java.util.Scanner; // Используем модули Scanner

class Main {

    public static void main(String[] args) throws Exception { // Программа загадывает число
        int result = (int) (Math.random() * 100);
        randomNumber(result); // Указываем что загаданное число относится к следующему методу
    }

    public static void randomNumber(int result) { // метод
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        System.out.println("Your input: " + number);

        if (result == number) {
            System.out.println("It is wright answer");
        } else {
            if (result > number) {
                System.out.println("the number must be greater");
//                randomNumber(result);
            } else {
                System.out.println("the number must be less");
//                randomNumber(result);
            }
            randomNumber(result);
        }
    }
}
