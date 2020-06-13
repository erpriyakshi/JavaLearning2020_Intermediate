package com.priyakshi.numbertype;

public class Main {
    public static void main(String[] args) {
        EvenOddFinder evenOddFinder = new EvenOddFinder();
        NumberType numberType = evenOddFinder.getNumberType(2);
        System.out.println(numberType);
    }
}
