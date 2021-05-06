package com.company;

public class Main {

    public static void main(String[] args) {
        // whileでとにかく計算をしてゴリ押す、何か解法が間違っている気しかしない
        long num = 600851475143L;
        long a = 2;
        while(true) {
            if(num%a==0) {
                num = num/a;
            }else if (a > num){
                break;
            }else{
                a++;
            }
        }
        System.out.println(a);
    }
}
