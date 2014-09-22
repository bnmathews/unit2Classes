import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xCoord;
    private int yCoord;
    private int ln;
    private int wi;
    private boolean colored;
    
    public Target(int x, int y, int length, int width)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double body1 = new Ellipse2D.Double(xCoord, yCoord, ln, wi);
        Ellipse2D.Double body2 = new Ellipse2D.Double(xCoord+25, yCoord+25, ln - (ln/4), wi - (wi/4));
        Ellipse2D.Double body3 = new Ellipse2D.Double(xCoord+50, yCoord+50, ln - (ln/2), wi - (wi/2));
        Ellipse2D.Double body4 = new Ellipse2D.Double(xCoord+75, yCoord+75, ln - (ln/1.33), wi - (wi/1.33));
        Ellipse2D.Double body5 = new Ellipse2D.Double(xCoord+90, yCoord+90, ln - (ln/1.111), wi - (wi/1.111));
        
        /*
        Ellipse2D.Double body1 = new Ellipse2D.Double(xCoord, yCoord, 200 * ln, 200 * wi);
        Ellipse2D.Double body2 = new Ellipse2D.Double(xCoord+25, yCoord+25, 150 * ln, 150 * wi);
        Ellipse2D.Double body3 = new Ellipse2D.Double(xCoord+50, yCoord+50, 100 * ln, 100 * wi);
        Ellipse2D.Double body4 = new Ellipse2D.Double(xCoord+75, yCoord+75, 50 * ln, 50 * wi);
        Ellipse2D.Double body5 = new Ellipse2D.Double(xCoord+90, yCoord+90, 20 * ln, 20 * wi);
        */
       
        g2.setPaint(Color.black);
        g2.fill(body1);
        g2.setPaint(Color.white);
        g2.fill(body2);
        g2.setPaint(Color.black);
        g2.fill(body3);
        g2.setPaint(Color.white);
        g2.fill(body4);
        g2.setPaint(Color.black);
        g2.fill(body5);
    }
    
}