package com.priyakshi.numbertype;

public class EvenOddFinder {

    public NumberType getNumberType(Integer value) {
        if (value != null && value % 2 == 0) {
            return NumberType.EVEN;
        }
        return NumberType.ODD;
    }
}
