

package pl.itacademy.lesson4;

public class MobilePhone {

    String brand;
    String model;
    String battery;
    Double capacity;
    Double batteryAmount;
    Double memory;
    Double freeMemory;


    double GM = 100;
    double T = 200;
    double Pokemon = 250;


    String installAppGM() {
        return "Application Google maps has been installed on Samsung galaxy. Remain memory:" + (memory - GM);
    }

    String installAppT() {
        return "Application Tinder has been installed on Samsung galaxy. Remain memory:" + (memory - GM - T);
    }

    double hourUse = 100.0;


    String installAppPok() {
        return "Application Pokemon GO can't be installed on Samsung galaxy. There are no enough memory";

    }

    String useYT() {
        return "Application YouTube has been ran for 5 hours on Samsung galaxy. Remain battery capacity:" + (capacity - hourUse * 5);
    }

    String useF() {
        return "Application Facebook has been used for 5 hours on Samsung galaxy. Phone has been discharged.";
    }
String useAB() {
    return "Application Angry Birds can't be run on Samsung galaxy. Phone discharged";
}
        String useAnB(){
            return "Application Angry Birds has been ran for 2 hours on Samsung galaxy. Remain battery capacity:"+ (capacity-hourUse*2);
    }
}


