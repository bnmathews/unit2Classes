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
        
        int fbuildingmult = rand.nextInt((18 - 10) + 1) + 10;
        int bbuildingmult = rand.nextInt((12 - 5) + 1) + 10;
        
        Color fbuildingcolor = new Color(2 * fbuildingmult,2 * fbuildingmult,2 * fbuildingmult);
        Color bbuildingcolor = new Color(bbuildingmult,bbuildingmult,bbuildingmult);
        Color skycolor = new Color(rand.nextInt(30-1),0,rand2.nextInt(200-1));
        
        Color fsillcolor = new Color(80 + fbuildingmult,80 + fbuildingmult,80 + fbuildingmult);
        
        Color bsillcolor = new Color(80 + bbuildingmult,80 + bbuildingmult,80 + bbuildingmult);
        
        int skybrightness = skycolor.getGreen() + skycolor.getRed() + skycolor.getBlue();
        //This gets the brighness of the sky, below 100 would be considered night
        
        int skydarkness = 255 - (skybrightness);
        
        int windowmult = 2 * skydarkness;
        
        //int streetmult = 
        
        if (windowmult >= 255)
        {
            windowmult = 245;
        }
        
        Color windowcolor = new Color(windowmult,windowmult,0);
        
        Color streetcolor = new Color(30+(skybrightness/5),30+(skybrightness/5),30+(skybrightness/5));
        
        SkyBox s;
        
        if (skybrightness < 100)
        {
            s = new SkyBox(160,110,getWidth(),getHeight(),skycolor,true);
        }
        else
        {
            s = new SkyBox(160,110,getWidth(),getHeight(),skycolor,false);
        }
        
        Building b = new Building(50,340,100,200,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b2 = new Building(-60,320,100,220,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b3 = new Building(160,410,140,130,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        Building b4 = new Building(310,400,140,140,fbuildingcolor,windowcolor,fsillcolor,"single", "ac");
        Building b5 = new Building(460,300,120,240,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b6 = new Building(590,330,120,210,fbuildingcolor,windowcolor,fsillcolor,"revolving", "none");
        Building b7 = new Building(720,370,140,170,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        
        Building b8 = new Building(20,270,100,270,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b9 = new Building(140,260,100,280,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b10 = new Building(160,410,140,130,bbuildingcolor,windowcolor,bsillcolor,"single", "none");
        Building b11 = new Building(310,400,140,140,bbuildingcolor,windowcolor,bsillcolor,"single", "ac");
        Building b12 = new Building(460,300,120,240,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b13 = new Building(590,330,120,210,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b14 = new Building(720,370,140,170,bbuildingcolor,windowcolor,bsillcolor,"single", "none");
        
        Street str = new Street(0,540,getWidth(),30,streetcolor);
        
        s.draw(g2);
        
        //Back row of buildings
        b8.draw(g2);
        b9.draw(g2);
        //b10.draw(g2);
        //b11.draw(g2);
        //b12.draw(g2);
        //b13.draw(g2);
        //b14.draw(g2);
        
        //Front row of buildings
        b.draw(g2);
        b2.draw(g2);
        //b3.draw(g2);
        //b4.draw(g2);
        b5.draw(g2);
        b6.draw(g2);
        b7.draw(g2);
        
        str.draw(g2);
    }

}
