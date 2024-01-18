package com.nighthawk.hacks.cbCorrections;

public class Q20 {
    // method to perform some mystery operation on a 1D array
    public static void mystery(int[] array) {
        System.out.print("Original Array: ");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }

        // print the modified array
        System.out.print("Modified Array: ");
        printArray(array);

    }

    // method to print a 1D array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // create a 1D array
        int[] myArray = {1, 2, 3, 4, 5};

        // call the mystery method with the array
        mystery(myArray);
    }
}


