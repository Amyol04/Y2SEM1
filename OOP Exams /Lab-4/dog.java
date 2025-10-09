
/**
 * Write a description of class Dog here.
 *
 * @Amy o leary
 * @R00246749
 */
public class Dog
{
    //making the objects 
    private String name;
    private int age;
    private Breed breed;
    private String colour;
    
    // getting the breed , name , age and colour 
    public Dog(String name, int age, Breed breed, String colour){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.colour = colour;
    }
    // setters 
    public void setName(String name) {
        this.name = name; 
    }
    //returns 
    public String getName(){
        return name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setBreed(Breed breed) {
        this.breed = breed; 
    }
    
    public Breed getBreed(){
        return breed;
    }
    
    public void setColour(String colour) {
        this.colour = colour; 
    }
    
    public String getColour(){
        return colour;
    }
    
    public void bark(){
        System.out.println(name + "woof woof");
    }
    // num of barks, changes amount 
    public void bark(int times){
        
        for(int i = 0; i < times; i++){
            System.out.println(name + "woof Woof!");
        }
    }
    //prints 
    public String toString() {
      return this.name + " is a " +  this.age + " year old" + this.breed + ".";
   }

    public void print() {
      System.out.println(this.toString());
   }
}
