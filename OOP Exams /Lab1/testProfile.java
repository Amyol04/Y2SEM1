import java.util.Scanner;

public class TestProfile
{
    
    public static void main(String[] args){
    
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = myScanner.nextLine();
        
        System.out.println("Please enter the city you live in:");
        String city = myScanner.nextLine();
        
        System.out.println("Please enter your age:");
        int age = Integer.parseInt(myScanner.nextLine());
        
        System.out.println("My name is " + name);
        System.out.println("I live in " + city);
        System.out.println("I am " + age + " years old.");
        
        
    }
    
}
