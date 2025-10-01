
/**
 * Write a description of class actorTest here.
 *
 * @Amy  o leary  R00246749
 * 
 */
public class ActorTest

//this sets the name , age , bio and more for the actors and the directos 
{
    public static void main(){
        
        Actor a1 = new Actor(); 
        a1.setName("Frank");
        a1.setPhoto("this is my photo");
        a1.setBio("amazing actor 10/10"); 
        a1.setAge(45);
        
        a1.credit();
        a1.credit("mel smyth");
        a1.print(); 
        
        Actor a2 = new Actor(); 
        a2.setName("Bojack");
        a2.setPhoto("this is my own photo");
        a2.setBio("amazing actor 11/10"); 
        a2.setAge(45);
        
        a2.credit();
        a2.credit("smyth mel");
        a2.print(); 
        
    }
}
