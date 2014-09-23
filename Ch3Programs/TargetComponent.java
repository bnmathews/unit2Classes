import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random; 
import java.awt.Color;


public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        Random rand4 = new Random();
        
        Color firstcolor = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
        Color secondcolor = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
        Color thirdcolor = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
        Color fourthcolor = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
        Color fifthcolor = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
       
        Target targ = new Target(getWidth()/2 - 100,getHeight()/2 - 100,200,200,firstcolor,secondcolor,thirdcolor,fourthcolor,fifthcolor);
        //Target targ = new Target(40,40,200,200);
        
        targ.draw(g2);
    }
}