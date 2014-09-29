//import java.util.Scanner;

public class DistanceConverter
{
   static final double FEET_PER_YARD = 3;
   static final double INCHES_PER_FOOT = 12;
   
   public static void main(String[] args)
   {
      double yards = 3.5;
      double FEET = yards * FEET_PER_YARD;
      double INCHES = FEET * INCHES_PER_FOOT;
      
      System.out.println(yards + " yards are " + FEET + " feet");
      System.out.println(yards + " yards are " + INCHES + " inches");
   }
}