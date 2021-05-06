package com.company;

public class Main {
    // 総当たりな計算で算出してみる
    public static void main(String[] args) {
        int sum = 2;
        int a1 = 1;
        int a2 = 2;
        while(a2 <= 4000000) {
            int tmp = a1 + a2;
            if (tmp % 2 == 0) {
                sum += tmp;
            }
            a1 = a2;
            a2 = tmp;
        }
        System.out.println(sum);
    }
}
