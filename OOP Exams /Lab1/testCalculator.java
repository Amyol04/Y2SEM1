
import java.util.Scanner;

public class TestCalculator
{

    public static void main(String[] args){

        boolean requiresMenuInput = true;

        Scanner myScanner = new Scanner(System.in);

        do {

            System.out.println("========== Calculator ==========");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("===============================");

            int chosenOption = myScanner.nextInt();

            switch(chosenOption){
                case 1: addition(); 
                    break;

                case 2: subtraction();
                    break;
                    
                case 3: multiplication();
                    break;
                    
                case 4: division();
                    break;

                case 5: requiresMenuInput = false;
                    break;
            }

        }
        while(requiresMenuInput == true);

    }

    private static void addition(){

        Scanner calcScanner = new Scanner(System.in);

        System.out.println("Please input your first number:");
        int x = calcScanner.nextInt();

        System.out.println("Please input your second number:");
        int y = calcScanner.nextInt();

        int answer = x + y;

        System.out.println("The answer is " + answer);

    }

    private static void subtraction(){

        Scanner calcScanner = new Scanner(System.in);

        System.out.println("Please input your first number:");
        int x = calcScanner.nextInt();

        System.out.println("Please input your second number:");
        int y = calcScanner.nextInt();

        int answer = x - y;

        System.out.println("The answer is " + answer);

    }

    private static void multiplication(){

        Scanner calcScanner = new Scanner(System.in);

        System.out.println("Please input your first number:");
        int x = calcScanner.nextInt();

        System.out.println("Please input your second number:");
        int y = calcScanner.nextInt();

        int answer = x * y;

        System.out.println("The answer is " + answer);

    }
    
        private static void division(){
    
        Scanner calcScanner = new Scanner(System.in);
        
        System.out.println("Please input your first number:");
        double x = calcScanner.nextDouble();
        
        System.out.println("Please input your second number:");
        double y = calcScanner.nextDouble();
        
        double answer = x / y;
        
        System.out.println("The answer is " + answer);
    
    }

}
