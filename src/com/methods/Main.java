// Java program to demonstrate methods overloading with static and non-static modifiers

package com.methods;

// Main class
public class Main {

    // Method get to sum two integers
    public static int add(int number, int number1){ // Compiler exception
        int sum = number + number1;
        return sum;
    }

    // Method get to sum three integers
    public int add(int number, int number1, int number2){
        int sum = number + number1;
        return sum;
    }

    // Main method to run java program
    public static void main(String[] args) {

        // Creating Main instance
        Main m = new Main();

        // Calling method add() with two arguments
        System.out.println(Main.add(3, 5));

        // Calling method add() with three arguments
        System.out.println(m.add(3, 5, 8)); 

    }
}
