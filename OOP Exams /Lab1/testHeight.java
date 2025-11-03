import java.util.Scanner;

public class TestHeight
{
    public static void main(String[] args) {
        
        double height = 0;
        double width = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Please input the height:");
        height = Double.parseDouble(myScanner.nextLine());
        
        System.out.println("Please input the width:");
        width = Double.parseDouble(myScanner.nextLine());
        
        double area = height * width;
        
        System.out.println("*******");
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("*******");

        
    }
}
