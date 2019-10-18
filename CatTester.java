package pl.itacademy.lesson4;

public class CatTester {
    public static void main(String[] args) {
        Cat tom= new Cat();
        tom.name="Tom";
        System.out.println(tom.eat());

        System.out.println(tom.sleep());
        tom.hungry(true);
        tom.hungry( false);




    }
}

