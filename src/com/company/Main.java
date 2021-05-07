package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 2;
        int count = 1;
        loop1: while(true) {
            boolean flg = true;
            loop2: for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    flg = false;
                    break loop2;
                }
            }
            if(flg){
                if(count == 10001) break loop1;
                count ++;
            }
            i++;
        }
        System.out.println(i);
    }
}
