import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.util.Random;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author bnmathews
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Random rand = new Random();
        Random rand2 = new Random();
        Random rand3 = new Random();
        
        Color color = new Color(rand.nextInt(255-1),rand2.nextInt(255-1),rand3.nextInt(255-1));
       
        Building b = new Building(50,40,100,200,color,"revolving", "ac");
        Building b2 = new Building(160,110,140,130,color,"single", "none");
        SkyBox s = new SkyBox(160,110,140,130,color);
        
        b.draw(g2);
        b2.draw(g2);
        s.draw(g2);
    }

}
