package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // a+b+c=1000となるピタゴラス数を探す、計算時間を気にしなくていいなら総当たり戦術でいい気はする
        loop1: for(int c=1;c<1000; c++) {
            for (int b=1;b<1000; b++) {
                for(int a=1; a+b+c<=1000; a++){
                    if((Math.pow(a,2) + Math.pow(b,2))==Math.pow(c,2)&&a+b+c==1000){
                        System.out.println("a:" + a +", b:"+b+", c:"+c);
                        System.out.println(a*b*c);
                        break loop1;
                    }
                }
            }
        }
    }
}
