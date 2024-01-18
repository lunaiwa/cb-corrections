package com.nighthawk.hacks.cbCorrections;

public class Q22 {
    // method to print a 2D array
    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // create a 2D array
        int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // print the original array
        System.out.println("Original Array:");
        printArray(myArray);

        // print the modified array
        System.out.println("Modified Array:");
        printArray(myArray);
    }
}


