package LabTwo;

public class Factorial {
    private static int factorial(int n) {

        int result = 1; //Initialize result to 1 (since factorial starts from 1)

        // Task2 Loop from 2 to n and multiply each number with result
        for (int factor =2; factor <= n; factor++){

            result *= factor; // multiply result bu current factor. 

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));// puts factoral number into code. 
    }
}
