
/**
 * Write a description of class objectList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ObjectList
{
    private Object[] list;
    private int total; // repersents number of elements in the array

    public ObjectList (int size){
        list = new Object[size];
        total = 0;
    }

    public boolean add(Object q){
        if(isFull())
            return false; 

        list[total] = q; 
        total++; 
        return true;
    }

    public boolean isEmpty(){
        return total == 0;
    }

    public boolean isFull(){
        return total == list.length;
    }

    public Object getObject(int index){
        if(index<0 && index<total)
            return list[index];
        return null; 
    }

    public int getTotal(){
        return total;
    }

    public boolean remove(int index){
        if(isEmpty())
            return false; 
            
        if(index <= 0 && index<total)
            for(int i = index; i<total-1; i++){ //index is , looking at the total. if index is less then (enter num), then we go though this loop, otherwise total -- 
                list[index] = list[index + 1]; 
            }
        total --;
        return true; 
    }
    
    public Object[] getObjectList(){
        return list;
    }
}
