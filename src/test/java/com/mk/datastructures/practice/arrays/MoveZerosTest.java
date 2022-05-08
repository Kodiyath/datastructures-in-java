package com.mk.datastructures.practice.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    @Test
    void moveZeros() {
        int[] arr = new int[] {1, 4, 0, 3, 0, 0};
        MoveZeros.moveZeros(arr);
        assertArrayEquals(arr, new int[] {1, 4, 3, 0, 0, 0});
    }

    @Test
    void moveZeros_arrayWithZeros() {
        int[] arr = new int[] {0};
        MoveZeros.moveZeros(arr);
        assertArrayEquals(arr, new int[] {0});
    }

    @Test
    void emptyArray() {
        int[] arr = new int[] {};
        MoveZeros.moveZeros(arr);
        assertArrayEquals(arr, new int[] {});
    }


}