package com.mk.datastructures.practice.arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 *
 * Given an integer array nums, move all 0's to the end of it
 * while maintaining the relative order of the non-zero elements
 * 
 */
public class MoveZeros {
    public static void moveZeros(final int [] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
