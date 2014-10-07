import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Building
{
    private int xCoord;
    private int yCoord;
    private int ln;
    private int wi;
    private Color col; 
    private Color wcol; 
    private Color scol; 
    private String doortype;
    private String accessory;
    
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
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body1 = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        Rectangle2D.Double roof = new Rectangle2D.Double(xCoord, yCoord - (ln * .04), wi, ln / 20);
        
        Rectangle2D.Double airconditioner = new Rectangle2D.Double(xCoord + (wi / 2.35), yCoord - (ln * .09), wi / 3, ln / 16);
        
        Rectangle2D.Double sill = new Rectangle2D.Double(xCoord, yCoord + (ln * .22), wi, ln / 20);
        Rectangle2D.Double sill2 = new Rectangle2D.Double(xCoord, yCoord + (ln * .48), wi, ln / 20);
        Rectangle2D.Double sill3 = new Rectangle2D.Double(xCoord, yCoord + (ln * .74), wi, ln / 20);
        
        Rectangle2D.Double singledoor = new Rectangle2D.Double(xCoord + (wi / 2.35), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8);
        Rectangle2D.Double halfdoor = new Rectangle2D.Double(xCoord + (wi / 1.95), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8); //usually 200 / 8
        Rectangle2D.Double halfdoor2 = new Rectangle2D.Double(xCoord + ( (wi / 2.05 ) - wi / 6), yCoord + (ln * .877) - (26 - ln / 7.6), wi / 6, 200 / 8);
        
        Rectangle2D.Double window = new Rectangle2D.Double(xCoord + (wi * .05), yCoord, wi / 4, ln / 4.5);
        Rectangle2D.Double window2 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord, wi / 4, ln / 4.5);
        Rectangle2D.Double window3 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord, wi / 4, ln / 4.5);
        
        Rectangle2D.Double window4 = new Rectangle2D.Double(xCoord + (wi * .05), yCoord + (ln * .27), wi / 4, ln / 4.5);
        Rectangle2D.Double window5 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord + (ln * .27), wi / 4, ln / 4.5);
        Rectangle2D.Double window6 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord + (ln * .27), wi / 4, ln / 4.5);
        
        Rectangle2D.Double window7 = new Rectangle2D.Double(xCoord + (wi * .05), yCoord + (ln * .52), wi / 4, ln / 4.5);
        Rectangle2D.Double window8 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord + (ln * .52), wi / 4, ln / 4.5);
        Rectangle2D.Double window9 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord + (ln * .52), wi / 4, ln / 4.5);
        
        g2.setPaint(col);
        g2.fill(body1);
        
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
        
        g2.setPaint(scol);
        g2.fill(sill);
        g2.fill(sill2);
        g2.fill(sill3);
        g2.fill(roof);
        if (doortype == "revolving")
        {
            g2.setPaint(Color.GRAY);
            g2.fill(halfdoor);
            g2.fill(halfdoor2);
        }
        else if (doortype == "single")
        {
            g2.fill(singledoor);
        }
        
        if (accessory == "ac")
        {
            g2.setPaint(scol);
            g2.fill(airconditioner);
        }
    }
    
}