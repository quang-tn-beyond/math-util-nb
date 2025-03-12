package com.quangtn.math.util.nb.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    public static Object[][] initData(){
        return new Object[][]{
                {0, 1}, {1,1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}
        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgRunsWell(int n, long x){
        assertEquals(x, MathUtility.getFactorial(n));
    }
}