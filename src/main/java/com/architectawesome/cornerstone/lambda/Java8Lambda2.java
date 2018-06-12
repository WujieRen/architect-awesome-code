package com.architectawesome.cornerstone.lambda;

/**
 * Created by renwujie on 2018/06/12 at 11:23
 *
 *1. lambda只能引用标记为final的外部局部变量。即不能在lambda内修改定义在域外部的局部变量，否则编译报错。
 *2. 可以直接在lambda中访问外层局部变量
 *3.
 *  int num = 1;
    Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
    s.convert(2);
    num = 5;
    //报错信息：Local variable num defined in an enclosing scope must be final or effectively
    final
 *4. lambda表达式当中不允许声明一个与局部变量同名的参数或局部变量。否则编译报错。
 */
public class Java8Lambda2 {
    final static String saluation = "Hi ";

    public static void main(String[] args){
        //1
        GreetingService greetingService = message -> {
            //saluation = "Hello ";
            System.out.println(saluation + message);
        };
        greetingService.sayMessage("renwujie");

        //2.
        final int num = 1;
        Converter<Integer, String> s = param -> System.out.println(String.valueOf(param) + num);
        s.convert(2);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    interface Converter<T1, T2>{
        void convert(int i);
    }

}
