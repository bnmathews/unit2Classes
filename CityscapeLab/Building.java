import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

/**
 * Building class draws a building with a constant number of windows, but other aesthetics can be altered
 * 
 * @author bnmathews
 * @version 8 October 2014
 */
public class Building
{
    /** Where the building is positioned on the x plane */
    private int xCoord;
    /** Where the building is positioned on the y plane */
    private int yCoord;
    /** The height of the building */
    private int ln;
    /** The width of the building */
    private int wi;
    /** The color of the building */
    private Color col; 
    /** The color of the building's windows */
    private Color wcol; 
<<<<<<< HEAD
    /** The color of the buildings windowsills */
    private Color scol; 
    /** The type of door the building uses ("revolving","single") */
=======
    private Color scol; 
>>>>>>> origin/master
    private String doortype;
    /** The type of accessory the building displays ("antenna","ac","none") */
    private String accessory;
    
<<<<<<< HEAD
    /**
     * Constructor for Building that specifies:
     * the x position,
     * the y position,
     * the width and length,
     * the building's color,
     * the window's color,
     * the windowsill's color,
     * the type of door the building uses,
     * and the type of accessory the building displays 
     */
=======
>>>>>>> origin/master
    public Building(int x, int y, int width, int length, Color color, Color wcol, Color scol, String door, String acc)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
        this.wcol = wcol;
        this.scol = scol;
        doortype = door;
        accessory = acc;
    }
    
    /**
     * Draws the Building
     */
    public void draw(Graphics2D g2)
    {
        //Creates the base body of the building
        Rectangle2D.Double body = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        //Creates the roof
        Rectangle2D.Double roof = new Rectangle2D.Double(xCoord, yCoord - (ln * .04), wi, ln / 20);
        
        //Creates an a/c unit on top of the building
        Rectangle2D.Double airconditioner = new Rectangle2D.Double(xCoord + (wi / 2.35), yCoord - (ln * .09), wi / 3, ln / 16);
        
        //Creates an antenna on top of the building
        Rectangle2D.Double antenna = new Rectangle2D.Double(xCoord + (wi / 1.4), yCoord - (ln * .35), wi / 15, ln / 3);
        
        //Creates the windowsills under the windows
        Rectangle2D.Double sill = new Rectangle2D.Double(xCoord, yCoord + (ln * .22), wi, ln / 20);
        Rectangle2D.Double sill2 = new Rectangle2D.Double(xCoord, yCoord + (ln * .48), wi, ln / 20);
        Rectangle2D.Double sill3 = new Rectangle2D.Double(xCoord, yCoord + (ln * .74), wi, ln / 20);
        
        //Creates the specified type of door
        Rectangle2D.Double singledoor = new Rectangle2D.Double(xCoord + (wi / 2.35), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8);
        Rectangle2D.Double halfdoor = new Rectangle2D.Double(xCoord + (wi / 1.95), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8); //usually 200 / 8
        Rectangle2D.Double halfdoor2 = new Rectangle2D.Double(xCoord + ( (wi / 2.05 ) - wi / 6), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8);
        
        //Creates the windows
        Rectangle2D.Double window = new Rectangle2D.Double(xCoord + (wi * .05), yCoord, wi / 4, ln / 4.5);
        Rectangle2D.Double window2 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord, wi / 4, ln / 4.5);
        Rectangle2D.Double window3 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord, wi / 4, ln / 4.5);
        
        Rectangle2D.Double window4 = new Rectangle2D.Double(xCoord + (wi * .05), yCoord + (ln * .27), wi / 4, ln / 4.5);
        Rectangle2D.Double window5 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord + (ln * .27), wi / 4, ln / 4.5);
        Rectangle2D.Double window6 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord + (ln * .27), wi / 4, ln / 4.5);
        
        Rectangle2D.Double window7 = new Rectangle2D.Double(xCoord + (wi * .05), yCoord + (ln * .52), wi / 4, ln / 4.5);
        Rectangle2D.Double window8 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord + (ln * .52), wi / 4, ln / 4.5);
        Rectangle2D.Double window9 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord + (ln * .52), wi / 4, ln / 4.5);
        
        //Draws and fills the body of the building with the user's specified color
        g2.setPaint(col);
        g2.fill(body);
        
        //Draws and fills the windows with the window color
        g2.setPaint(wcol);
        g2.fill(window);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
        g2.fill(window5);
        g2.fill(window6);
        g2.fill(window7);
        g2.fill(window8);
        g2.fill(window9);
        
<<<<<<< HEAD
        //Draws and fills the windowsills and the roof with the windowsill color
=======
>>>>>>> origin/master
        g2.setPaint(scol);
        g2.fill(sill);
        g2.fill(sill2);
        g2.fill(sill3);
        g2.fill(roof);
        
        //Determines which door to use based on the user's choice, the draws and fills it
        if (doortype == "revolving")
        {
            g2.setPaint(Color.GRAY);
            g2.fill(halfdoor);
            g2.fill(halfdoor2);
        }
        else if (doortype == "single")
        {
            g2.setPaint(Color.GRAY);
            g2.fill(singledoor);
        }
        
        //Determines what accessory to use, then draws and fills it 
        //Using anything other than "antenna" or "ac" will not display any accessory
        if (accessory == "ac")
        {
            g2.setPaint(scol);
            g2.fill(airconditioner);
        }
        else if (accessory == "antenna")
        {
            g2.setPaint(scol);
            g2.fill(antenna);
        }
    }
    
}