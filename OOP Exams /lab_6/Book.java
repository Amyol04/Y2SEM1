/**
 * Write a description of class book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private String title, author;
    private int ISBN; 
    
    public Book(int ISBN){
        this.ISBN = ISBN;
    }
    
    public Book(String title, String author, int ISBN){
        this.title = title;
        this.author = author; 
        this.ISBN = ISBN;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public int getISBN(){
        return ISBN;
    }
    
        
    public void  setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author ){
        this.author = author; 
    }
    
    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }
    
    public String toString(){
        return "Book details: " + getTitle() +  "The Title: " + " written by " + getAuthor()+ "With an ISBN of " + getISBN();
    }
    
    public void print(){
        System.out.println(toString());
    }
    
}
