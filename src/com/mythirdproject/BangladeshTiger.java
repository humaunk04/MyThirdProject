package com.mythirdproject;

public class BangladeshTiger {

    public static void main (String [] args){

        System.out.println("BangladeshTiger");
        myFirstMethod();
        mySecondMethod();


    }
    // this is my first method
    public static void myFirstMethod() {

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40;
        float e = 50;
        double f = 6000;
        char irhaa;
        irhaa = 'a';
        boolean myName;
        myName = true;

        // The Arithmetic operators
        System.out.println(c % b);
        System.out.println(c + b);
        System.out.println(c - b);
        System.out.println(c * b);
        System.out.println(e / f);
        // what is Primitive Data Types
        System.out.println("my name is Irhaa" + " " + myName);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(irhaa);
        irhaa++;
        System.out.println(irhaa);
        irhaa++;
        System.out.println(irhaa);
        irhaa--;
        System.out.println(irhaa);
        irhaa = 100;
        System.out.println(irhaa);
    }
    // this is my second method the unary operators
    public static void mySecondMethod(){

        int aNumber;
        aNumber = 10;
        aNumber++;
        aNumber++;
        int bNumber;
        bNumber = 20;
        bNumber--;
        bNumber--;
        boolean irhaa = true;



        System.out.println(aNumber);
        System.out.println(bNumber);
        System.out.println(!irhaa);

    }
}
