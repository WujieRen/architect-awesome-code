package com.architectawesome.cornerstone.lambda;

/**
 * Created by renwujie on 2018/06/12 at 11:06
 *
 * (parameters) -> expression
 * 或
 * (parameters) ->{ statements; }
 */
public class Java8Lambda {
    public static void main(String[] args){
        Java8Lambda lambda = new Java8Lambda();

        //声明类型
        MathOperation addition = (int a, int b) -> a + b;
        //不声明类型
        MathOperation subtraction = (a, b) -> a - b;
        //大括号中有返回语句
        MathOperation multiplication = (a, b) -> {return a * b; };

        System.out.println("10 + 5 = " + lambda.operate(10, 5, addition) );
        System.out.println("10 - 5 = " + lambda.operate(10, 5, subtraction) );
        System.out.println("10* 5 = " + lambda.operate(10, 5, multiplication) );

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = (message) -> {
            System.out.println("Hi " + message);
        };

        greetingService1.sayMessage("renwujie");
        greetingService2.sayMessage("sixin");

    }
    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

}
