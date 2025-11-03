/**
 * Write a description of class Grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        String[] name = new String[5]; 
        int[] mark = new int[5];
        String[] grade = new String[5];
        int index = 0;
        Scanner input = new Scanner(System.in);
        
        while(index < 5) {
            System.out.println("Enter student name:");
            name[index] = input.nextLine();
            
            System.out.println("Enter your examination mark:");
            mark[index] = input.nextInt();
            input.nextLine();  // consume the newline
            
            // Determine grade
            if (mark[index] >= 70 && mark[index] <= 100) {
                grade[index] = "H1";
            } else if (mark[index] >= 63) {
                grade[index] = "H2.1";
            } else if (mark[index] >= 55) {
                grade[index] = "H2.2";
            } else if (mark[index] >= 40) {
                grade[index] = "Pass";
            } else {
                grade[index] = "Fail";
            }
            
            index++;
        }
        
        // Output results
        System.out.println("\nRESULTS");
        System.out.println("-------------");
        
        for(int i = 0; i < 5; i++) {
            System.out.println(name[i] + " received " + grade[i] + " for their mark of " + mark[i]);
        }
        
        input.close();
    }
}
