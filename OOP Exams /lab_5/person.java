
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age; 
    private char gender; 
    
    public Person(){
    }
    
    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender; 
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    
    public void setGender(char gender){
        this.gender = gender; 
        }
    
    public String getName(){
        return name; 
    }
    
    public int getAge(){
        return age;
    }
    
    public char getGender(){
        return gender;
    }
    
    public String toString(){
        return "the name is " + name + " the age is" + age + "the gender is" + gender+ ".";
    }
    
    public void printDetails(){
        System.out.println(this.toString());
    }
}
