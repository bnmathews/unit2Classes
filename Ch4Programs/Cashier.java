import java.util.Scanner;

public class Cashier
{
    
    public Cashier()
    {
    }
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter amount due in pennies: ");
        Double due = s.nextDouble();
        
        System.out.print("Enter amount recieved in pennies: ");
        Double paid = s.nextDouble();
        
        Double change = paid - due;
        
        int dollars = (int)(change / 100);
        change = change % 100; //gives what is left over
        int quarters = (int)(change / 25);
        change = change % 25;
        int nickels = (int)(change / 5);
        change = change % 5;
        int dimes = (int)(change / 1);
        change = change % 5
        int pennies =  (int)(change / .01);
        
        System.out.println("Total Change: " + change);
        System.out.println("Dollars: " + dollars);  
        System.out.println("Quarters: " + quarters);  
        System.out.println("Nickels: " + nickels);  
        System.out.println("Dimes: " + dimes);  
        System.out.println("Pennies: " + pennies);  
    }

}
