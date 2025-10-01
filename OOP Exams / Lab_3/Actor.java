
/**
 * Write a description of class actor here.
 *
 * @Amy o leary R00246749
 *
 */
public class Actor
{
    //making the objects 
    private String name;
    private String photo; 
    private String bio; 
    private int age;
    
    public Actor(){
    }
    
    public Actor(String name, String photo , String bio ){ 
        //sets the values 
        this.name = name;
        this.photo =photo; 
        this.bio = bio;
        this.age = age;
        
    }
    //setters 
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
        public void setPhoto(String photo){
        this.photo = photo;
    }
    
        public void setBio(String bio){
        this.bio = bio;
    }
    // credit print line 
    public void credit(){
        System.out.println(name + " acted in (film name");
    }
    //print line with director 
    public void credit(String director){
        System.out.println(name + " acted in (film name) with director" + director );
    }
    // print line for actor 
    public String toString(){
        return name + "acted in (film name), The photo is" + photo + "The bio is " + bio; 
    }

    public void print(){
        System.out.println(toString()); 
    }
}
