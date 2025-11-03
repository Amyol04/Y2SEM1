/**
 * ==========================================================
 * MEGA JAVA NOTES FILE - OPEN BOOK FRIENDLY
 * ==========================================================
 * This file contains examples of most Java concepts seen in
 * introductory and intermediate programming classes.
 *
 * Every line has comments explaining what it does.
 *
 * Author: Amy O'Leary (R00246749)
 */

import java.util.Scanner;
import java.util.ArrayList;

///////////////////////////////////////////////////////////////
// 1. CLASSES AND OBJECTS
///////////////////////////////////////////////////////////////

/**
 * Actor class demonstrates:
 *  - Class definition
 *  - Private fields
 *  - Constructors (default & parameterized)
 *  - Setters / Getters
 *  - Method overloading
 *  - Printing object info
 */
class Actor {
    private String name; // Actor's name
    private int age;     // Actor's age
    private String bio;  // Short biography

    // Default constructor - sets default values if none provided
    public Actor() {
        this.name = "Unknown";
        this.age = 0;
        this.bio = "No bio";
    }

    // Parameterized constructor - allows setting all fields at creation
    public Actor(String name, int age, String bio) {
        this.name = name;  // 'this' refers to current object's field
        this.age = age;
        this.bio = bio;
    }

    // Setter methods - allow updating private fields
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setBio(String bio) { this.bio = bio; }

    // Getter methods - allow reading private fields
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getBio() { return bio; }

    // Method overloading example - same method name, different parameters
    public void credit() {
        System.out.println(name + " has credits in unspecified films.");
    }

    public void credit(String director) {
        System.out.println(name + " worked with director " + director);
    }

    // Print method - shows all info about the actor
    public void print() {
        System.out.println(name + " (" + age + " years old): " + bio);
    }
}

///////////////////////////////////////////////////////////////
// 2. COMPOSITION / OBJECTS WITHIN OBJECTS
///////////////////////////////////////////////////////////////

/**
 * Breed class shows composition: objects can contain other objects.
 */
class Breed {
    private String name;       // Breed name, e.g., "Labrador"
    private boolean endangered; // true = endangered, false = common

    public Breed(String name, boolean endangered) {
        this.name = name;
        this.endangered = endangered;
    }

    // Getter methods
    public String getName() { return name; }
    public boolean isEndangered() { return endangered; }

    // Print-friendly string
    public String toString() {
        return name + (endangered ? " (endangered)" : ""); // Conditional operator
    }
}

class Dog {
    private String name;   // Dog's name
    private int age;       // Dog's age
    private Breed breed;   // Dog's breed (composition)
    private String color;  // Dog's color

    // Constructor - initializes all fields
    public Dog(String name, int age, Breed breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    // Setters and Getters
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setAge(int age) { this.age = age; }
    public int getAge() { return age; }

    public void setBreed(Breed breed) { this.breed = breed; }
    public Breed getBreed() { return breed; }

    public void setColor(String color) { this.color = color; }
    public String getColor() { return color; }

    // Method overloading: bark with default or custom number of times
    public void bark() { System.out.println(name + " says: Woof!"); }
    public void bark(int times) {
        for (int i = 0; i < times; i++) { // Loop 'times' times
            System.out.println(name + " says: Woof Woof!");
        }
    }

    // Print all info about the dog
    public void print() {
        System.out.println(name + " is a " + age + "-year-old " + breed + " colored " + color);
    }
}

///////////////////////////////////////////////////////////////
// 3. ARRAYS AND LOOPS
///////////////////////////////////////////////////////////////

/**
 * GradeExample shows:
 *  - Using arrays for data storage
 *  - Looping through arrays
 *  - Conditional statements to calculate grades
 */
class GradeExample {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "Diana", "Ethan"};
        int[] marks = {75, 68, 55, 42, 33};
        String[] grades = new String[5]; // Same length as students

        // Calculate grade letters using a for loop
        for (int i = 0; i < students.length; i++) {
            int mark = marks[i]; // Get each student's mark
            if (mark >= 70) grades[i] = "H1";
            else if (mark >= 63) grades[i] = "H2.1";
            else if (mark >= 55) grades[i] = "H2.2";
            else if (mark >= 40) grades[i] = "Pass";
            else grades[i] = "Fail";
        }

        // Print results
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " received grade: " + grades[i]);
        }
    }
}

///////////////////////////////////////////////////////////////
// 4. SCANNER AND USER INPUT
///////////////////////////////////////////////////////////////

/**
 * CalculatorExample demonstrates:
 *  - Using Scanner for input
 *  - switch statements
 *  - method calls for operations
 */
class CalculatorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        boolean keepRunning = true; // Loop control

        while (keepRunning) {
            // Display menu
            System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide  5. Exit");
            int choice = scanner.nextInt(); // Read user choice

            // Switch statement executes code based on choice
            switch (choice) {
                case 1: performAddition(scanner); break;
                case 2: performSubtraction(scanner); break;
                case 3: performMultiplication(scanner); break;
                case 4: performDivision(scanner); break;
                case 5: keepRunning = false; break; // Exit loop
            }
        }
    }

    // Each operation asks for two numbers and prints result
    private static void performAddition(Scanner s) {
        System.out.print("Enter first number: ");
        int x = s.nextInt();
        System.out.print("Enter second number: ");
        int y = s.nextInt();
        System.out.println("Result: " + (x + y));
    }

    private static void performSubtraction(Scanner s) {
        System.out.print("Enter first number: ");
        int x = s.nextInt();
        System.out.print("Enter second number: ");
        int y = s.nextInt();
        System.out.println("Result: " + (x - y));
    }

    private static void performMultiplication(Scanner s) {
        System.out.print("Enter first number: ");
        int x = s.nextInt();
        System.out.print("Enter second number: ");
        int y = s.nextInt();
        System.out.println("Result: " + (x * y));
    }

    private static void performDivision(Scanner s) {
        System.out.print("Enter first number: ");
        double x = s.nextDouble();
        System.out.print("Enter second number: ");
        double y = s.nextDouble();
        System.out.println("Result: " + (x / y)); // Division produces double
    }
}

///////////////////////////////////////////////////////////////
// 5. DYNAMIC ARRAYS / ARRAYLIST
///////////////////////////////////////////////////////////////

/**
 * AddressBookExample demonstrates:
 *  - Using ArrayList (dynamic arrays)
 *  - Adding, searching, deleting objects
 *  - Looping through ArrayList
 */
class AddressBookExample {
    public static void main(String[] args) {
        ArrayList<Person> book = new ArrayList<>();
        book.add(new Person("Amy", 21, 'F')); // Add new person
        book.add(new Person("Bob", 22, 'M'));

        // Search by name
        String searchName = "Amy";
        for (Person p : book) { // Enhanced for-loop
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + p);
            }
        }

        // Delete person by index
        book.remove(1); // Remove second element

        // Print remaining people
        for (Person p : book) {
            p.printDetails();
        }
    }
}

///////////////////////////////////////////////////////////////
// 6. WHILE LOOPS AND STRING MANIPULATION
///////////////////////////////////////////////////////////////

/**
 * SailingSongExample:
 *  - While loop with countdown
 *  - Conditional singular/plural word
 */
class SailingSongExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of ships: ");
        int ships = s.nextInt();

        while (ships > 0) {
            // Ternary operator for singular/plural
            String shipWord = (ships == 1) ? "Ship" : "Ships";

            System.out.println(ships + " " + shipWord + " sailing on the sea");
            System.out.println("One stopped suddenly and started bailing\n");

            ships--; // Decrement ships
        }

        if (ships == 0) { // When countdown ends
            System.out.println("No more ships sailing on the sea!");
        }
    }
}

///////////////////////////////////////////////////////////////
// 7. PERSON CLASS (FOR COMPOSITION / ENCAPSULATION)
///////////////////////////////////////////////////////////////

/**
 * Person class demonstrates:
 *  - Private fields
 *  - Constructors
 *  - Getters and setters
 *  - toString() method
 */
class Person {
    private String name;
    private int age;
    private char gender;

    public Person() {} // Default constructor

    public Person(String name, int age, char gender) { // Parameterized constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGender(char gender) { this.gender = gender; }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public char getGender() { return gender; }

    // Print-friendly string
    public String toString() { return name + " (" + age + ", " + gender + ")"; }

    // Prints person details
    public void printDetails() { System.out.println(this); }
}

///////////////////////////////////////////////////////////////
// END OF MEGA JAVA NOTES
///////////////////////////////////////////////////////////////
