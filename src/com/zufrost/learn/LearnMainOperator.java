package com.zufrost.learn;

public class LearnMainOperator {
    public static void main(String[] args) {
        int x = 8;
        int y = 5;
        int z = x / y;
        System.out.println(z);

        z = x % y;
        System.out.println(z);

        byte a = 1;
        byte b = 2;
        byte c = (byte) (a + b);
        System.out.println(c);

        final byte d = 1;
        final byte e = 2;
        byte f = d + e;
        System.out.println(c);
    }
}
