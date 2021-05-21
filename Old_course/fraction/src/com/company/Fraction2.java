package com.company;

public class Fraction2 {
   private int numerator;
   private int denominator;

   public Fraction2() { //Конструктор класса должен инициализировать их заданным набором значений.
       this.numerator = 12;
       this.denominator = 24;
   }

   public Fraction2(int numerator, int denominator) {
       this.numerator = numerator;
       this.denominator = denominator;
   }

    public int getNumerator() {
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void fractionPrint() { //Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;
        System.out.println("Дробь в формате X/Y:  " + numerator + "/" + denominator);
    }

    public int summarize (int x, int y, int z, int w) {
       if (y > w) {
           int summarizeN = x + z * ( y / w);
           return summarizeN;
       } else {
           int summarizeN = x * (z / y) + z;
           return summarizeN;
       }

    }


        public static void main(String[] args) {

            Fraction2 fraction = new Fraction2();
            System.out.println("Числитель: " + fraction.numerator);
            System.out.println("Знаменатель: " + fraction.denominator);
            System.out.println();

            fraction.fractionPrint();

            Fraction2 fractionOne = new Fraction2(5, 6);// Вторая дробь для задания

            int x = fraction.numerator;
            int y = fraction.denominator;
            int z = fractionOne.numerator;
            int w = fractionOne.denominator;
            System.out.println(z);

    }
    }




