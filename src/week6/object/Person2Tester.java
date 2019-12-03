package week6.object;

public class Person2Tester {
    public static void main(String[] args) {
        Person2 first=new Person2 ("Jan", "Kowalski");
        Person2 second=new Person2 ("Jan", "Kowalski");

        first=second;
        
        if (first==second){
            System.out.println("persons are the same objects");
        }
        if (first.equals(second)){
            System.out.println("persons are equal");
        }
    }
}
