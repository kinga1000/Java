package cwiczenia;

import java.util.Set;
import java.util.HashSet;



public class Banks {


    public static void main(String[] args) {
        HashSet<String> banks = new HashSet<>(3);

        banks.add("ing");
        banks.add("pko");
        banks.add("getin");

        int setSize = banks.size();
        System.out.println(setSize);
        boolean itis = banks.contains("ing");
        System.out.println(itis);
        boolean itis2 = banks.contains("pko2");
        System.out.println(itis2);
        System.out.println(banks.toString());


banks.remove("ing");
            System.out.println(banks.toString());


    }
    }