
/**
 * Write a description of class Breed here.
 *
 * @amy o leary
 * @R00246749
 */
public class Breed
{
    private String name;
    private boolean endangeredList;
    
    public Breed(){}
    
    public Breed(String name){
        this.name = name; 
    }
    
    public Breed(String name , boolean endangeredList){
        this.name =name;
        this.endangeredList = endangeredList; 
    }
    
    public void setBreedName(){
        this.name = name;
    }
    
    public String getBreedName(){
        return name;
    }
    
    public void getEndangeredList(boolean endangeredList){
        this.endangeredList = endangeredList;
    }
    
    public boolean getEndangeredList(){
        return endangeredList; 
    }   
    //endangered list true or false, adds comment based on true or false. 
    public String toString(){
            String s = null;
            if (getEndangeredList())
                s = " on endangered list";
            else
                s = " not on endangered list";
            return (getBreedName() + " and is " + s);
        }

   public void print() {
      System.out.println(this.toString());
   }
}