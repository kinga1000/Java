package cwiczenia;

import java.util.*;


public class AlgorithmTasks {
    public static void main(String[] args) {

        Set<Character> words = new TreeSet<>();

        String s = "This is a test text";
        char[] letters = s.toCharArray();
        for (char s2 : letters) {
            if (s2 != ' ') {
                words.add(s2);
            }

        }

        System.out.println(words.toString());

        //private static void print(String s){
          //  char[]chars=s.toCharArray();
          //  Map<Character, Integer> print2=new HashMapp<>();
          //  for(char )


            //uzyj compute lub getordefaultp- no metody
        }

        // List<Character> words2 = new ArrayList<>();

        // String s3= "This is a test text";

        // char[] letters2=s3.toCharArray();
        // for(char s4: letters2) {
        //     if (s4 != ' ') {
        //        words2.add(s4);
//
        //  }
        //}


        //System.out.println(words2.toString());

        //  System.out.println(Collections.frequency(words2, 'i'));
        // System.out.println(Collections.frequency(words2,'h'));
        // System.out.println(Collections.frequency(words2, 't'));
        // System.out.println(Collections.frequency(words2,'s'));
        // System.out.println(Collections.frequency(words2, 'a'));
        // System.out.println(Collections.frequency(words2,'x'));
    }
