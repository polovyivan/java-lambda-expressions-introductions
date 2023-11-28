package com.polovyi.ivan.tutorials;


public class FunctionalInterfaceExample {
    @FunctionalInterface
    interface CorrectFunctionalInterface {
        String someMethod(String text);
    }
    @FunctionalInterface
    interface CorrectFunctionalInterface2 {
        String SOME_STATIC_VARIABLE = "variable";
        String someMethod(String text);
        default boolean someDefaultMethod() {return true;}
        static boolean someStaticMethod() {return true;}
    }

    @FunctionalInterface // special case
    interface CorrectFunctionalInterface3 {
        String someMethod(String text);
        String toString();
        boolean equals(Object o);
        int hashCode();
    }

    // @FunctionalInterface -- won't compile
    interface IncorrectFunctionalInterface2 {
        String someMethod(String text);
        String someMethod2(String s1, String s2);
    }
    //@FunctionalInterface -- won't compile
    interface IncorrectFunctionalInterface {
        String someMethod1(String text);
        String someMethod2(String text);
    }

    public static void main(String[] args) {
        CorrectFunctionalInterface lambda1 = s -> s.toLowerCase();
        CorrectFunctionalInterface2 lambda2 = s -> s.toLowerCase();
        CorrectFunctionalInterface3 lambda3 = s -> s.toLowerCase();
        // IncorrectFunctionalInterface lambda2 = s -> s.toLowerCase(); -- wont compile
        // IncorrectFunctionalInterface2 lambda2 = s -> s.toLowerCase(); -- wont compile
    }
}
