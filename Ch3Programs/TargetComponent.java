import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.util.Random; 


public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //Random rand = new Random();
        
        //int r = rand.nextInt(200) + 1;
        
        //System.out.println(r);
        
        Target targ = new Target(20,20,200,200);
        
        targ.draw(g2);
    }
}