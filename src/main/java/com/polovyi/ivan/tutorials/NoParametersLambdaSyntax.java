package com.polovyi.ivan.tutorials;


public class NoParametersLambdaSyntax {

    interface NoParametersLambda {
        void someMethod();
    }

    public static void main(String[] args) {
        NoParametersLambda lambda1 = () -> { System.out.println("Lambda1"); };
        NoParametersLambda lambda2 = () -> System.out.println("Lambda2");
    }
}
