package com.mk.datastructures.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {

    @Test
    void reverse() {
        assertEquals(ReverseInteger.reverse(54321), 12345);
        assertEquals(ReverseInteger.reverse(-54321), -12345);
        assertEquals(ReverseInteger.reverse(0), 0);
    }

}