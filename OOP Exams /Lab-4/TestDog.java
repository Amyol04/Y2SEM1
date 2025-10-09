
/**
 * Write a description of class TestDog here.
 *
 * @Amy o leary
 * @R00246749
 */
public class TestDog
{
    public static void main(){
        //dog breed one 
        Breed terrierBreed = new Breed(" Terrier");
        Dog dog1 = new Dog("sammy ", 12 , terrierBreed , "brown");
        dog1.print();
        dog1.bark(); 
        dog1.bark(4);
        // dog breed 2 
        Breed LabradorBreed = new Breed(" Labrador");
        Dog dog2 = new Dog("jussie ", 7 , LabradorBreed , "black");
        dog2.print();
        dog2.bark();
        dog2.bark(4);
        // dog breed 3 
        Breed StaffieBreed = new Breed(" Staffie",true);
        Dog dog3 = new Dog("Jess ", 10 , StaffieBreed, "tan");
        dog3.print();
        dog3.bark();
        dog3.bark(4);
        
        
        
    }
    
}