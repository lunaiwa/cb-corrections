package com.nighthawk.hacks.cbCorrections;

public class Q8 {
    // method perform a desired operation on a 2D array
    public static void operation(int[][] array) {
    
        System.out.println("Original 2D Array:");
        printArray(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] *= 2;
            }
        }

        // display the modified 2D array
        System.out.println("Modified 2D Array:");
        printArray(array);
    }

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

        // call the operation method with the array
        operation(myArray);
    }
}
