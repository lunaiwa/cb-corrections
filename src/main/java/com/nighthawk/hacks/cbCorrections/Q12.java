package com.nighthawk.hacks.cbCorrections;

public class Q12 {
    public static void main(String[] args) {
        // given boolean values
        boolean x = true;
        boolean y = false;

        // compound boolean expression using DeMorgan's law
        boolean result = !(x && y) || (!x || y);

        // display the given boolean values and the result of the expression
        System.out.println("Given values: x = " + x + ", y = " + y);
        System.out.println("Result: " + result);
    }
}


