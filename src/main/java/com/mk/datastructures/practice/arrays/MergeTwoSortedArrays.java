package com.mk.datastructures.practice.arrays;

/**
 * In this problem, you have to implement the mergeArrays() function
 * which merges two arrays in the sorted way.
 *
 * <p>
 * int[] mergeArrays(int[] arr1, int[] arr2)
 * <p>
 * Output
 * <p>
 * Merged array consisting all elements of both arrays in a sorted way
 * Sample Input
 * <p>
 * arr1 = {1,3,4,5}
 * <p>
 * arr2 = {2,6,7,8}
 * <p>
 * Sample Output
 * <p>
 * arr = {1,2,3,4,5,6,7,8}
 */
public class MergeTwoSortedArrays {
    public static int[] mergeArrays(final int[] arr1, final int[] arr2) {
        // Boundary conditions
        if (arr1 == null && arr2 == null) {
            return null;
        } else if (arr2 == null || arr2.length == 0) {
            return arr1;
        } else if (arr1 == null || arr1.length == 0) {
            return arr2;
        }

        final int totalLength = arr1.length + arr2.length;
        final int[] resultArr = new int[totalLength];

        // Index to iterate arr1
        int arr1Index = 0;

        // Index to iterate arr2
        int arr2Index = 0;

        // Index to iterate the resultArr index
        int resultArrIndex = 0;

        while (arr1Index < arr1.length && arr2Index < arr2.length) {
            if(arr1[arr1Index] <= arr2[arr2Index]) {
                resultArr[resultArrIndex++] = arr1[arr1Index++];
            } else {
                resultArr[resultArrIndex++] = arr2[arr2Index++];
            }
        }

        while (arr1Index < arr1.length) {
            resultArr[resultArrIndex++] = arr1[arr1Index++];
        }

        while (arr2Index < arr2.length) {
            resultArr[resultArrIndex++] = arr2[arr2Index++];
        }

        return resultArr;
    }
}
