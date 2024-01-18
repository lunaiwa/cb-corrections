package com.nighthawk.hacks.cbCorrections;

public class Q24 {

    public void one(int value) {
        // implementation for the first version of the method
        System.out.println("Calling one(int) with value: " + value);
    }

    public void one(String value) {
        // implementation for the overloaded version of the method with a different signature
        System.out.println("Calling one(String) with value: " + value);
    }

    public static void main(String[] args) {
        Q24 myObj = new Q24();
        
        // call the first version of 'one' method
        myObj.one(42);

        // call the overloaded version of 'one' method
        myObj.one("Hello");
    }
}

