import java.util.Scanner;

public class PhoneNumber
{
    
    public PhoneNumber()
    {
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter a 10-digit phone number: ");
        String number = s.nextLine();
        
        String area = number.substring(0,3);
        String numpt1 = number.substring(3,6);
        String numpt2 = number.substring(6);
        
        area = "(" + area + ")";
        
        System.out.println("Your number reformatted is: " + area + numpt1 + "-" + numpt2);  
        
    }

}
