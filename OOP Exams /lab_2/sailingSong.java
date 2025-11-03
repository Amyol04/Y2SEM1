
/**
 * Write a description of class sailingSong here.
 *
 * @author amy o leary / R00246749
 */
import java.util.Scanner;
public class SailingSong
{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter a number ");
        int numShips = Integer.parseInt(myScanner.nextLine());
        String word = " Ships";
        
        System.out.println("Sailing song");
        System.out.println("-------");
        
    while(numShips > 0){ 
        
        if(numShips == 1){
            word = "Ship";
        } // singalizes ships. 
        
        System.out.println(numShips + word + " Sailing on the sea");
        System.out.println(numShips + word + " a sailing");
        System.out.println("One stopped suddenly");
        System.out.println("and started bailing");
        System.out.println();
        
        numShips --; //minuses the number ships
    }
    
    if(numShips == 0 ){
         System.out.println("no more ships a sailing on the sea");   
     }

    }
}
