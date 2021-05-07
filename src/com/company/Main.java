package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 地獄の総当たり
        long sum = 0;
        for(long i = 2; i < 2000000; i ++){
            boolean flg = true;
            // 計算量を減らすためiの平方根をとってその値までで割り切れる数が存在するかチェック
            for(long j = 2; j <= Math.sqrt(i); j ++){
                if(j != i && i%j==0){
                    flg = false;
                    break;
                }
            }
            if(flg) sum+=i;
        }
        System.out.println(sum);
    }
}
