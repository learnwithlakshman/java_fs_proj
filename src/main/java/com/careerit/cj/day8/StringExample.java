package com.careerit.cj.day8;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Java World";
        String s2 = "Java World";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Java World");
        String s4 = new String("Java World");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));


        String str1 = "Core Java";
        String str2 = "Core";
        String str3 = " java";
        String str4 = str2.concat(str3);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1 == str4);
        System.out.println(str1.equalsIgnoreCase(str4));

    }
}
