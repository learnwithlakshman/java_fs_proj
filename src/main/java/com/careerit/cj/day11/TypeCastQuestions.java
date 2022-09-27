package com.careerit.cj.day11;

public class TypeCastQuestions {

    private static String str;

    public static void main(String[] args) {

            Object obj = "Hello";
            String str = (String)obj;
            System.out.println(str.toUpperCase());
    }
}
