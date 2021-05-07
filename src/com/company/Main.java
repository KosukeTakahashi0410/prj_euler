package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20で割り切れる
        // これら全ての最小公倍数を出せば行けそうなので、手で計算した方が早そうな気はするけどどうなんでしょうか→実装が大変そう
        // 総当たりでいきます
        int a = 20*19;
        while(true){
            boolean flg = true;
            for(int i = 2; i <= 20; i ++){
                if(a%i!=0){
                    flg = false;
                    break;
                }
            }
            if(!flg){
                // 1-20の最小公倍数なので必ず偶数
                a+=2;
            }else{
                System.out.println(a);
                break;
            }
        }
    }
}
