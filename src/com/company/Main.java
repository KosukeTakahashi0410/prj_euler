package com.company;

public class Main {

    public static void main(String[] args) {
        /** 等差数列の問題として解くといいっぽい
         *  3*1 = 3, 3*2 = 6, ... ,3*333 = 999
         *  5*1 = 5, 5*2 = 10, ... ,5*199 = 995
         *  15*1 = 15, 15*2 = 30, ... ,15*66 = 990
         *  n個の等差数列の和は（初項+末項）*n/2
         */
        int a = 3*(1+(999/3))*(999/3)/2;
        int b = 5*(1+(999/5))*(999/5)/2;
        int c = 15*(1+(999/15))*(999/15)/2;
        System.out.println(a);
        System.out.println(a + b - c);
    }
}
