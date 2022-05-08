package com.mk.datastructures.practice;

public class ReverseInteger {
    public static int reverse(int x) {
        int reversedNumber = 0;
        int i = 0;
        int tempX = Math.abs(x);
        while(tempX > 0) {
            int remainder = tempX % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            tempX = tempX / 10;
            i++;
        }

        if (x < 0) {
            reversedNumber = reversedNumber * -1;
        }

        return reversedNumber;
    }
}
