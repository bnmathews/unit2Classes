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
        
        int buildingmult = rand.nextInt(30+10);
        int windowrange = rand.nextInt(5+1);
        
        Color buildingcolor = new Color(2 * buildingmult,2 * buildingmult,2 * buildingmult);
        Color skycolor = new Color(rand.nextInt(30-1),0,rand2.nextInt(200-1));
        
        int skybrightness = skycolor.getGreen() + skycolor.getRed() + skycolor.getBlue();
        //This gets the brighness of the sky, below 100 would be considered night
        
        System.out.println(skybrightness);
        
        int skydarkness = 150 - (skybrightness);
        
        Color windowcolor = new Color((skydarkness*2),(skydarkness*2),0);
        
        SkyBox s;
        
        if (skybrightness < 100)
        {
            s = new SkyBox(160,110,getWidth(),getHeight(),skycolor,true);
        }
        else
        {
            s = new SkyBox(160,110,getWidth(),getHeight(),skycolor,false);
        }
        
        Building b = new Building(50,340,100,200,buildingcolor,windowcolor,"revolving", "ac");
        Building b2 = new Building(160,410,140,130,buildingcolor,windowcolor,"single", "none");
        Building b3 = new Building(160,410,140,130,buildingcolor,windowcolor,"single", "none");
        
        s.draw(g2);
        b.draw(g2);
        b2.draw(g2);
    }

}
