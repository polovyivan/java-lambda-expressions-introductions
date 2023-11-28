package com.polovyi.ivan.tutorials;


public class MultipleParametersLambdaSyntax {

    interface MultipleParametersLambda {
        String someMethod(String s1, String s2);
    }

    public static void main(String[] args) {
        MultipleParametersLambda lambda1 = (String s1, String s2) -> {return s1.concat(s2);};
        MultipleParametersLambda lambda2 = (s1, s2) -> {return s1.concat(s2);};
        MultipleParametersLambda lambda3 = (s1, s2) -> s1.concat(s2);
    }
}
