package com.zufrost.learn;

public class Quest {
    static int j = 2;
    public static void result(int i){
        i *= 10;
        j += 2;
    }
    public static void main(String[] args){
        char i = '1';
        result(i);
        System.out.println(i + " " + j);
    }
}
