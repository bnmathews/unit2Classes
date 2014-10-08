import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * SkyBox class draws the sky, the sun, and the moon
 * 
 * @author bnmathews
 * @version 8 October 2014
 */
public class SkyBox
{
    /** Where the sun is positioned on the x plane */
    private int sxCoord;
    /** Where the sun is positioned on the y plane */
    private int syCoord;
    /** Where the moon is positioned on the x plane */
    private int mxCoord;
    /** Where the moon is positioned on the y plane */
    private int myCoord;
    /** The height of the sky */
    private int ln;
    /** The width of the sky */
    private int wi;
    /** The color of the sky */
    private Color skycolor; 
    
    /**
     * Constructor for SkyBox that specifies:
     * the sun's x position,
     * the sun's y position,
     * the width and length of the sky,
     * the sky's color,
     * the moon's x position,
     * and the moon's y position
     */
    public SkyBox(int sunx, int suny, int width, int length, Color mainsky, int moonx, int moony)
    {
        sxCoord = sunx;
        syCoord = suny;
        mxCoord = moonx;
        myCoord = moony;
        ln = length;
        wi = width;
        skycolor = mainsky;
    }
    
    /**
     * Draws the SkyBox
     */
    public void draw(Graphics2D g2)
    {
        //Creates the sky background
        Rectangle2D.Double sky1 = new Rectangle2D.Double(0, 0, wi, ln);
        
        //Creates the sun
        Ellipse2D.Double sun = new Ellipse2D.Double(sxCoord, syCoord, 90, 90);
        
        //Creates the moon
        Ellipse2D.Double moon = new Ellipse2D.Double(mxCoord, myCoord, 90, 90);
        
        //Draws and fills the sky
        g2.setPaint(skycolor);
        g2.fill(sky1);
        
        //Draws and fills the sun
        g2.setPaint(Color.YELLOW);
        g2.fill(sun);
        
        //Draws and fills the moon
        g2.setPaint(Color.WHITE);
        g2.fill(moon);
    }
    
}