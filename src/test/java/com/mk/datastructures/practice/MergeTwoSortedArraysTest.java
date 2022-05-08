package com.mk.datastructures.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedArraysTest {

    @Test
    void mergeArraysTest() {
        int[] result = MergeTwoSortedArrays.mergeArrays(new int[] {1, 2, 5}, new int[] {3, 6});
        assertArrayEquals(result, new int[] {1, 2, 3, 5, 6});

        result = MergeTwoSortedArrays.mergeArrays(new int[] {1, 2}, new int[] {5, 6});
        assertArrayEquals(result, new int[] {1, 2, 5, 6});

        result = MergeTwoSortedArrays.mergeArrays(new int[] {5, 6}, new int[] {1, 2});
        assertArrayEquals(result, new int[] {1, 2, 5, 6});
    }

    @Test
    void mergeArraysTest_arr1Null() {
        final int[] result = MergeTwoSortedArrays.mergeArrays(null, new int[] {3, 6});
        assertArrayEquals(result, new int[] {3, 6});
    }

    @Test
    void mergeArraysTest_arr2Null() {
        final int[] result = MergeTwoSortedArrays.mergeArrays(new int[] {1, 2, 5}, null);
        assertArrayEquals(result, new int[] {1, 2, 5});
    }

    @Test
    void mergeArraysTest_nullArrays() {
        final int[] result = MergeTwoSortedArrays.mergeArrays(null, null);
        assertNull(result);
    }


    @Test
    void mergeArraysTest_arr1Empty() {
        final int[] result = MergeTwoSortedArrays.mergeArrays(new int[] {}, new int[] {3, 6});
        assertArrayEquals(result, new int[] {3, 6});
    }

    @Test
    void mergeArraysTest_arr2Empty() {
        final int[] result = MergeTwoSortedArrays.mergeArrays(new int[] {1, 2, 5}, new int[] {});
        assertArrayEquals(result, new int[] {1, 2, 5});
    }
}