package pl.itacademy.lesson4;

public class Cat {
    String name;
    boolean isHungry;
    boolean isPlaying;
    boolean isSleeping;
    boolean isEating;

    String eat() {
        return "Tom is eating milk";
    }
    String sleep(){
        return
                "Tom is going to sleep for 5 hours";
    }

    void hungry(boolean isHungry) {
        if (isHungry) {
            System.out.println("Tom is hungry after sleeping");
        } else {
            System.out.println("Tom is never hungry after eating");
        }
    }
}