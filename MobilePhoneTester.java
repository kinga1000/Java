
package pl.itacademy.lesson4;


public class MobilePhoneTester {

    public static void main(String[] args) {
        MobilePhone samsung = new MobilePhone();
        samsung.model="samsungGalaxy";
        samsung.capacity= 1000.0;
        samsung.memory= 500.0;

        System.out.println(samsung.installAppGM());
        System.out.println(samsung.installAppT());
        System.out.println(samsung.installAppPok());
        System.out.println(samsung.useYT());
        System.out.println(samsung.useF());
        System.out.println(samsung.useAB());
        System.out.println(samsung.useAnB());
    }
}
