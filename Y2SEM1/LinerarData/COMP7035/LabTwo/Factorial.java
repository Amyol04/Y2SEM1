package LabTwo;

public class Factorial {
    private static int factorial(int n) {

        int result = 1;
        // Task2
        for (int factor =2; factor <= n; factor++){
            result *= factor;

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
