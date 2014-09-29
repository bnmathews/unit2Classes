import java.util.Scanner;

public class Comma
{
    private int x;
    
    public Comma()
    {
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Gimmie a number between 1,000 and 999,999 (don't forget commas, yo): ");
        String number = s.nextLine();
        
        int len = number.length();
        
        //number = number.replaceAll(",","");  <-- This is the easy way.
        
        String sub1 = number.substring(0,len-4);
        String sub2 = number.substring(len-3);
        
        System.out.println("That string is, like, " + (sub1.length()+sub2.length()) + " numbers long or something.");
        System.out.println("Your freakin' number is: " + sub1 + sub2);
        
        
        
        
    }

}
