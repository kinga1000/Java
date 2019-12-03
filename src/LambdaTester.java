

import java.util.function.Function;

public class LambdaTester {


    public static void main(String[] args) {

        System.out.println(modifyString("java", s -> s.toUpperCase()));
        System.out.println(modifyString("java", s -> s.toLowerCase()));
        System.out.println(modifyString("java", s -> String.valueOf(s.charAt(0))));
        System.out.println(modifyString("java", s -> String.valueOf(s.charAt(s.length() - 1))));

        System.out.println(modifyString2("java", s -> s.length()));
    }

    public static String modifyString(String t, Function<String, String> function) {

        return function.apply(t);
    }


    public static Integer modifyString2(String t2, Function<String, Integer> function2) {

        return function2.apply(t2);
    }

}


