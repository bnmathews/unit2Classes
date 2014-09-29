import java.util.Scanner;

public class Rectangle
{
    public Rectangle()
    {
        
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input rectangle height: ");
        double left = s.nextDouble();
        
        /*
        System.out.print("Length of right side: ");
        double right = s.nextDouble();

        System.out.print("Length of top side: ");
        double top = s.nextDouble();
        */
       
        System.out.print("Input rectangle width: ");
        double bottom = s.nextDouble();
       
        System.out.println("The perimiter of that rectangle is: "+ 2*(left+bottom));
        System.out.println("The area of that rectangle is: "+ (left*bottom));
        System.out.println("That rectangle's diagonal is: "+ Math.sqrt(Math.pow(bottom,2)+Math.pow(left,2)));
    }

}
