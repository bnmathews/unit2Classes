

/**
 * Write a description of class fbhfhdhthf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Door
{
    
    private String front;
    private String name;
    //true = open false = closed
    private String state;
    
     
    /** description of instance variable x (add comment for each instance variable) */


    /**
     * Default constructor for objects of class fbhfhdhthf
     */
    public Door(String name, String state)
    {
        this.state = state;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public String getState(){
        return this.state;
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void open(){
        state = "open";
    }
    public void close(){
        state = "close";
    }
    public void setState(String newState){
        this.state = newState;
    }
    public static void main(String[] args){
         Door b = new Door("Brass","open");
        b.setState("open");
        System.out.println(b.getState());
        b.setState("close");
        System.out.println(b.getState());
        }

}
