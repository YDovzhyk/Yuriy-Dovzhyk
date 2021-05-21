package com.company;

public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;
    }

    public boolean checkTruck(Truck truck) {

        if (truck.weight > maxWeight) {

            return false;
        } else {

            return true;
        }
    }
   static class Truck {

       int weight;
       public Truck(int weight) {
           this.weight = weight;
       }
   }
   public int WeightTruck (){ // Метод который определяет вес грузовика
       int length = (int) ((Math.random() * 25) + 1);
       int width = (int) ((Math.random() * 4) + 1);
       int height = (int) ((Math.random() * 5) + 1);
       int weightTruck;
        weightTruck = length * width * height * 1000;
            return weightTruck;
        }


    public static void main(String[] args) {


        BridgeOfficer officer = new BridgeOfficer(15000);

        int firstWeightTruck = officer.WeightTruck(); // вызов переменной
        System.out.println("Вес первого грузовика: " + firstWeightTruck);

        int secondWeightTruck = officer.WeightTruck();
        System.out.println("Вес второго грузовика: " + secondWeightTruck);

        System.out.println();

        Truck first = new Truck(firstWeightTruck);
        Truck second = new Truck(secondWeightTruck);


        System.out.println("Грузовик номер 1! Могу я проехать, офицер?");
        boolean canFirstTruckGo = officer.checkTruck(first);
        System.out.println(canFirstTruckGo);

        System.out.println();

        System.out.println("Грузовик номер 2! А мне можно?");
        boolean canSecondTruckGo = officer.checkTruck(second);
        System.out.println(canSecondTruckGo);

    }
}
