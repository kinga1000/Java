package pl.itacademy;

public class CarTester {


        public static void main(String[] args) {



            Car vw = new Car("VW Golf", "diesel", 50.0);

            vw.drive(100, 50);
            vw.drive(260,50);
            vw.drive(500,50);
            vw.drive(100,200);
            vw.drive(100,50);
            vw.tank();

        }
    }

