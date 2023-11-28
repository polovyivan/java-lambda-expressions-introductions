package com.polovyi.ivan.tutorials;


public class SingleParameterLambdaSyntax {

    interface SingleParameterLambda {
        String someMethod(String text);
    }

    public static void main(String[] args) {
        //(ParameterType parameterName) -> { return <value of ParameterType>;}
        SingleParameterLambda lambda1 = (String s) -> {return s.toLowerCase();};
        SingleParameterLambda lambda2 = (s) -> {return s.toLowerCase();};
        SingleParameterLambda lambda3 = s -> {return s.toLowerCase();};
        SingleParameterLambda lambda4 = s -> s.toLowerCase();
    }
}
