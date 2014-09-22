import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;

public class Target
{
    private int xLeft;
    private int yTop;
    private int length;
    private int width;
    private boolean colored;
    
    public Target(int x, int y, int ln, int wi, boolean co)
    {
        xLeft = x;
        yTop = y;
        length = ln;
        width = wi;
        colored = co;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double body = new Ellipse2D.Double(xLeft, yTop, length, width);
        
        if (colored == true)
        {
            g2.setPaint(Color.white);
            g2.fill(body);
        }
        else
        {
            g2.setPaint(Color.black);
            g2.fill(body);
        }
        //g2.draw(body);
    }
}