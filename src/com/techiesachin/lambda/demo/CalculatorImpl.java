package com.techiesachin.lambda.demo;
interface Calculator{
 /*   void switchOn();*/
    //void sum(int input);
    int subtract(int i1, int i2);
}
public class CalculatorImpl {
    public static void main(String[] args) {
      /*  Calculator calculator=()->
            System.out.println("switch-On");
        calculator.switchOn();*/
      /*  Calculator calculator= (input -> System.out.println("Sum"+ input));
        calculator.sum(123);*/

        Calculator calculator = (i1, i2) -> {
            if (i2<i1) {
                throw new RuntimeException("message") ;
                }else{
                    return i1 - i2;
                }
        };
    }
}