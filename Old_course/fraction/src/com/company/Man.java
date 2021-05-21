package com.company;

import java.util.Scanner; // Используем модули Scanner

public class Man {

    private String name;
    private static int age;
    private static String gender;
    private static int weight;

    public Man(String name, int age, String gender, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // Позволяют редактировать переменные в других классах пакета
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) { // Позволяют редактировать переменные в других классах пакета
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { // Позволяют редактировать переменные в других классах пакета
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) { // Позволяют редактировать переменные в других классах пакета
        this.weight = weight;
    }


    public static class Student extends Man { //Создать производный класс Student, имеющий поле года обучения.

        int ageEducation;
        int yearStartEducation;
        int finishYearEducation;

        public Student(String name, int ageEducation, int finishYearEducation) {
            super(name, age, gender, weight);
            this.ageEducation = ageEducation;
            this.finishYearEducation = finishYearEducation;
        }

        public static int checkYearEducation() {
            int finishYearEducation;
            int yearStartEducation;

            System.out.println("Введите год начала обучения: ");
            Scanner scanner = new Scanner(System.in);
            yearStartEducation = scanner.nextInt();

            finishYearEducation = yearStartEducation + 5;
            {
                return finishYearEducation;
            }
        }
        public static int yearsStudLeft() {
            int yearsStudyLeft = 0;

            System.out.println("Введите год обучения: ");
            Scanner scanner = new Scanner(System.in);
            int yearStudy = scanner.nextInt();

            if (yearStudy > 5 || yearStudy < 1) {
                System.out.println("Год обучения не соответствует заданным критериям");
            } else {
                yearsStudyLeft = 5 - yearStudy;

        }
            return yearsStudyLeft;
        }
    }

        public static void main(String[] args) {

            Man manOne = new Man("Ivan", 25, "male", 74);

            System.out.println("Мы создали человека по имени " + manOne.name + ", его возраст - " + manOne.age + ", его пол - " + manOne.gender + ", его вес - " + manOne.weight);
            System.out.println();

            int finishYearEducation = Student.checkYearEducation();
            System.out.println("Год окончания обучения " + finishYearEducation);
            System.out.println();

            Student studentOne = new Student("Ivan", 5, finishYearEducation);
            System.out.println("Мы создали cтудента по имени " + manOne.name + ", лет обучения - " + studentOne.ageEducation + ", год окончания обучения - " +finishYearEducation );

            int yearsStudLeft = Student.yearsStudLeft();
            System.out.println("Осталось лет обучения: " + yearsStudLeft);


        }

    }







