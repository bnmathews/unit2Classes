import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class TargetComponent extends JComponent
{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        
        Target targ = new Target(x - 90,y - 90,200,200,false);
        Target targ2 = new Target(x - 65,y - 65,150,150,true);
        Target targ3 = new Target(x - 40,y - 40,100,100,false);
        Target targ4 = new Target(x - 15,y - 15,50,50,true);
        Target targ5 = new Target(x - 0,y - 0,20,20,false);
        
        targ.draw(g2);
        targ2.draw(g2);
        targ3.draw(g2);
        targ4.draw(g2);
        targ5.draw(g2);
    }
}