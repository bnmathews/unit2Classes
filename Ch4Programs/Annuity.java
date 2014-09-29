import java.util.Scanner;

public class Annuity
{
    private double paid;
    //private static double total = pmt * (( ( (Math.pow((1+I),(N-1))-1)/I ) / ((Math.pow((1+I),(N-1))) + 1) ));
    
    public Annuity()
    {
        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("What is your payment? ");
        double pmt = s.nextDouble();
        
        System.out.print("What is the interest? ");
        double i = s.nextDouble();
        i = i / 100;
        
        System.out.print("How many years? ");
        int n = s.nextInt();
        
        double one = Math.pow((1+i),(n-1))-1;
        double two = one/i;
        double three = Math.pow((1+i),(n-1));
        double four = two/three;
        double all = pmt*(four+1);
        
        System.out.println(all);
    }
    
}
