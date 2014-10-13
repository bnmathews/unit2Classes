import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

/**
 * Building class draws the cityscape's street
 * 
 * @author bnmathews
 * @version 8 October 2014
 */
public class Street
{
    /** Where the street is positioned on the x plane */
    private int xCoord;
    /** Where the street is positioned on the y plane */
    private int yCoord;
    /** The height of the street */
    private int ln;
    /** The width of the street */
    private int wi;
    /** The color of the street */
    private Color col; 
    
    /**
     * Constructor for Street that specifies:
     * the x position,
     * the y position,
     * the width and length,
     * and the street's color
     */
    public Street(int x, int y, int width, int length, Color color)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
    }
    
    /**
     * Draws the Street
     */
    public void draw(Graphics2D g2)
    {
        //Creates the whole street
        Rectangle2D.Double street = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        //Draws and fills the street with the street color
        g2.setPaint(col);
        g2.fill(street);
        
    }
}