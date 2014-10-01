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
    
    public Building(int x, int y, int width, int length, Color color)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double body1 = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        Rectangle2D.Double roof = new Rectangle2D.Double(xCoord, yCoord - (ln * .05), wi, ln / 20);
        
        Rectangle2D.Double sill = new Rectangle2D.Double(xCoord, yCoord + (ln * .25), wi, ln / 20);
        Rectangle2D.Double sill2 = new Rectangle2D.Double(xCoord, yCoord + (ln * .54), wi, ln / 20);
        
        Rectangle2D.Double window = new Rectangle2D.Double(xCoord + (wi * .05), yCoord, wi / 4, ln / 4);
        Rectangle2D.Double window2 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord, wi / 4, ln / 4);
        Rectangle2D.Double window3 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord, wi / 4, ln / 4);
        
        Rectangle2D.Double window4 = new Rectangle2D.Double(xCoord + (wi * .05), yCoord + (ln * .29), wi / 4, ln / 4);
        Rectangle2D.Double window5 = new Rectangle2D.Double(xCoord + (wi * .38), yCoord + (ln * .29), wi / 4, ln / 4);
        Rectangle2D.Double window6 = new Rectangle2D.Double(xCoord + (wi * .70), yCoord + (ln * .29), wi / 4, ln / 4);
        
        g2.setPaint(Color.BLACK);
        g2.fill(body1);
        
        g2.setPaint(Color.YELLOW);
        g2.fill(window);
        g2.fill(window2);
        g2.fill(window3);
        g2.fill(window4);
        g2.fill(window5);
        g2.fill(window6);
        
        g2.setPaint(Color.GRAY);
        g2.fill(sill);
        g2.fill(sill2);
        g2.fill(roof);
    }
    
}