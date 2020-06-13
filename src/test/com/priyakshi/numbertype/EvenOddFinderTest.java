package com.priyakshi.numbertype;

import com.priyakshi.numbertype.EvenOddFinder;
import com.priyakshi.numbertype.NumberType;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddFinderTest {

    @Test
    public void testGetNumberType_whenEvenValue() {
        // given
        int value = 10;

        EvenOddFinder testClass = new EvenOddFinder();

        // when
        NumberType numberType = testClass.getNumberType(value);

        // then
        assertEquals(NumberType.EVEN, numberType);
    }

    @Test
    public void testGetNumberType_whenOddValue() {
        // given
        int value = 3;

        EvenOddFinder testClass = new EvenOddFinder();

        // when
        NumberType numberType = testClass.getNumberType(value);

        // then
        assertEquals(NumberType.ODD, numberType);
    }
}