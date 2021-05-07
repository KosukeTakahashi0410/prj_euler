package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 総当たり計算で
        long a = 0;
        long b = 0;
        for(int i=1; i<=100; i++){
            a += Math.pow(i, 2);
            b += i;
        }
        // Math.powを使いたかったが、値がうまく表示できなかったのでb*bに
        System.out.println(b*b - a);
    }
}
