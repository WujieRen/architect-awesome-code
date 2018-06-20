package com.architectawesome.cornerstone.basicgrammer;

/**
 * Created by renwujie on 2018/06/19 at 22:58
 */
public class TestSpecificChar {
    public static void main(String[] args){
        String greeting = "Hello";
        int n = greeting.length();
        int cpCount = greeting.codePointCount(0,  greeting.length());
        System.out.println(n);
        System.out.println(cpCount);

        int indexCodePoint = greeting.offsetByCodePoints(0,3);
        int cp = greeting.codePointAt(indexCodePoint);
        System.out.println(indexCodePoint);
        System.out.println(cp);
        System.out.println(cp);

    }
}
