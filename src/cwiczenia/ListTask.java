package cwiczenia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


public class ListTask {
    public static void main(String[] args) {

        BigInteger a1 = BigInteger.valueOf(System.currentTimeMillis());
        System.out.println("Start point:" + a1);

        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < 100000; i++) {
            lista.add(0, i);
        }

        BigInteger b1 = BigInteger.valueOf(System.currentTimeMillis());
        System.out.println("End point :" + b1);
        System.out.println("Time spent on loop execution - ArrayList: " + (b1.subtract(a1)));

        BigInteger c1 = BigInteger.valueOf(System.currentTimeMillis());
        System.out.println("Start point:" + c1);

        List<Integer> lista2 = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            lista2.add(0, i);
        }

        BigInteger d1 = BigInteger.valueOf(System.currentTimeMillis());
        System.out.println("End point:" + d1);
        System.out.println("Time spent on loop execution-LinkedList: " + (d1.subtract(c1)));

        //loop execution in LinkedList lasts longer than in ArrayList.

        BigInteger e1 = BigInteger.valueOf(System.currentTimeMillis());

        System.out.println("Start point :" + e1);


        for (int i = 0; i < 100000; i++) {
            lista.get(i);

            BigInteger f1 = BigInteger.valueOf(System.currentTimeMillis());
            System.out.println("End point :" + f1);
            System.out.println("Time spent on loop execution-Array List: " + (f1.subtract(e1)));

            BigInteger g1 = BigInteger.valueOf(System.currentTimeMillis());
            System.out.println("Start point :" + g1);
            for (i = 0; i < 100000; i++) {
                lista2.get(i);
            }
            BigInteger h1 = BigInteger.valueOf(System.currentTimeMillis());
            System.out.println("End point:" + h1);
            System.out.println("Time spent on loop execution-LinkedList: " + (h1.subtract(g1)));

        }
    }
}
//Results show that there is better to use ArrayList if we need quick access to data.
//If we will focus on adding or removing elements, LinkedList is more required.
