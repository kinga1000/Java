package pl.itacademy;

public class Car {

    String name;
    Engine engine;
    String model;
    Double fuelCapacity;
    Double remainingFuel;


    public Car(String name, String engineName, Double fuelCapacity) {
        this.name = name;
        this.engine = engine;
        this.fuelCapacity = fuelCapacity;
        this.remainingFuel = fuelCapacity;

    }


    public void drive(double speed, double distance) {

        double fuelUsage = distance * (2 / 10);


        if (remainingFuel > fuelUsage) {

            remainingFuel = remainingFuel - fuelUsage;
            System.out.println("Car VW Golf has been driven for " + distance + " km with speed " + speed + " km/h. ");
            System.out.println("Remaining fuel:" + remainingFuel + "L");

        }else if(remainingFuel>0){

            remainingFuel=0.0;
            System.out.println("Car VW Golf has been driven for " + distance + " km with speed " + speed + " km/h. ");
            System.out.println("Tank is empty");


        } else {
            System.out.println("Car VW Golf cant be driven cause engine stopped");


        }}

        public void tank(){
            System.out.println("Car VW Golf has been tanked up");

        }
    }




