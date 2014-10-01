import java.util.Scanner;

public class Cashier
{
    
    public Cashier()
    {
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("How much is owed: ");
        Double due = s.nextDouble();
        
        System.out.print("How much was paid: ");
        Double paid = s.nextDouble();
        
        Double change = paid - due;
        
        int dollars = (int)(change / 1);
        int quarters = (int)(change / .25);
        int nickels = (int)(change / .05);
        int dimes = (int)(change / .10);
        int pennies =  (int)(change / .01);
        
        System.out.println("Total Change: " + change);
        System.out.println("Dollars: " + dollars);  
        System.out.println("Quarters: " + quarters);  
        System.out.println("Nickels: " + nickels);  
        System.out.println("Dimes: " + dimes);  
        System.out.println("Pennies: " + pennies);  
    }

}
