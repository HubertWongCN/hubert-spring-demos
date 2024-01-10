package org.hubert.tdd.cal;

/**
 * @author hubertwong
 */
public class Calculator {
    public int add(int i, int i1) {
        int r = i + i1;
        // HD 2-12 Overflow if both arguments have the opposite sign of the result
        if (((i ^ r) & (i1 ^ r)) < 0) {
            throw new ArithmeticException("integer overflow");
        }
        return i + i1;
    }
}
