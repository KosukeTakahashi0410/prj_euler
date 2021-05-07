package com.company;

public class Main {

    public static void main(String[] args) {
        // 二重ループで総当たり計算、ansに値を保存して都度値を比較してあげる
        int ans = 0;
        loop1: for(int i = 999; i > 100; i--){
            loop2: for(int j = 999; j > 100; j--){
                String tmp = String.valueOf(i * j);
                String[] a = tmp.split("");
                int len = a.length -1;
                boolean flg = true;
                loop3: for(int k = 0; k < a.length/2; k++){
                    if(!a[len].equals(a[k])){
                        flg = false;
                        break loop3;
                    }else{
                        len--;
                    }
                }
                if(flg != false && ans < Integer.parseInt(tmp)) {
                    ans = Integer.parseInt(tmp);
                    break loop2;
                }
            }
        }
        System.out.println(ans);
    }
}
