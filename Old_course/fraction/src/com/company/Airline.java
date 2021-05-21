package com.company;

public class Airline {
    static int carryingСapacity;
    static int seats;
    static int crewSize;
    static int rangeFlight;
    static int helicopterCount = 0;
    static int airplaneCount = 0;

    public Airline(int carryingСapacity, int seats, int crewSize, int rangeFlight) {
        this.carryingСapacity = carryingСapacity;
        this.seats = seats;
        this.crewSize = crewSize;
        this.rangeFlight = rangeFlight;
    }

    public int getCarryingСapacity() {
        return carryingСapacity;
    }

    public void setCarryingСapacity(int carryingСapacity) {
        this.carryingСapacity = carryingСapacity;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public int getRangeFlight() {
        return rangeFlight;
    }

    public void setRangeFlight(int rangeFlight) {
        this.rangeFlight = rangeFlight;
    }

    public static class Helicopter extends Airline {
        public Helicopter(int carryingСapacity, int crewSize, int rangeFlight) {
            super(carryingСapacity, seats, crewSize, rangeFlight);
        }

        public static class Airplane extends Airline {
            String airplaneModel;

            public Airplane(String airplaneModel, int seats, int crewSize, int rangeFlight) {
                super(carryingСapacity, seats, crewSize, rangeFlight);
                this.airplaneModel = airplaneModel;
            }
        }

        public static class Airfreighter extends Airline {
            public Airfreighter(int carryingСapacity, int crewSize, int rangeFlight) {
                super(carryingСapacity, seats, crewSize, rangeFlight);
            }
        }

        public int TotalCarryingCapacity(Airline...helicopters) {
            int totalCapacity;
            for (Airline carryingСapacity: helicopters) {
                totalCapacity += carryingСapacity;

                System.out.println(carryingСapacity);
                System.out.println(totalCapacity);
            }

            return 0;
        }


        public static void main(String[] args) {

            Helicopter helicopter1 = new Helicopter(11000, 3, 700);
            helicopterCount++;
            Helicopter helicopter2 = new Helicopter(20000, 5, 1000);
            helicopterCount++;
            Helicopter helicopter3 = new Helicopter(17000, 3, 700);
            helicopterCount++;
            Helicopter helicopter4 = new Helicopter(600, 1, 500);
            helicopterCount++;

            System.out.println("Total helicopter: " + helicopterCount);

            Airplane airplane1 = new Airplane("Boeing 300", 60, 2, 1000);
            airplaneCount++;
            Airplane airplane2 = new Airplane("Boeing 737", 150, 2, 1500);
            airplaneCount++;
            Airplane airplane4 = new Airplane("Boeing 747", 300, 5, 5000);
            airplaneCount++;


            int totalCarryingCapacity = helicopter1.TotalCarryingCapacity(helicopter1);
                System.out.println(totalCarryingCapacity);


        }
    }
}

