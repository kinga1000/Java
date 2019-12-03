package pl.itacademy;

public class Dog extends Pet{

    public Dog (String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    public void makeSound() {
        System.out.println("Wof");
}}
