package pl.itacademy.lesson4;

public class CarTester {
    public static void main(String[] args) {
        Engine diesel = new Engine();

        diesel.name = "Diesel";
        diesel.horsepower = 130.0;
        diesel.capacity = 2000.0;


        Car vw = new Car();
        vw.name = "VW Golf";
        vw.Engine = "diesel";
        vw.fuelCapacity = 50.0;




        vw.vwstart(true);
        vw.vwstart( false);


    }}