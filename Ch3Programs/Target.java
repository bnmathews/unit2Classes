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
    private Color col; 
    private Color col2;
    private Color col3;
    private Color col4;
    private Color col5;
    
    public Target(int x, int y, int length, int width, Color color, Color color2, Color color3, Color color4, Color color5)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
        col2 = color2;
        col3 = color3;
        col4 = color4;
        col5 = color5;
    }
    
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double body1 = new Ellipse2D.Double(xCoord, yCoord, ln, wi);
        Ellipse2D.Double body2 = new Ellipse2D.Double(xCoord+(ln/8), yCoord+(wi/8), ln - (ln/4), wi - (wi/4));
        Ellipse2D.Double body3 = new Ellipse2D.Double(xCoord+(ln/4), yCoord+(wi/4), ln - (ln/2), wi - (wi/2));
        Ellipse2D.Double body4 = new Ellipse2D.Double(xCoord+(ln/2.65), yCoord+(wi/2.65), ln - (ln/1.33), wi - (wi/1.33));
        Ellipse2D.Double body5 = new Ellipse2D.Double(xCoord+(ln/2.221), yCoord+(wi/2.221), ln - (ln/1.111), wi - (wi/1.111));
        
        /*
        Ellipse2D.Double body1 = new Ellipse2D.Double(xCoord, yCoord, ln, wi);
        Ellipse2D.Double body2 = new Ellipse2D.Double(xCoord+25, yCoord+25, ln - (ln/4), wi - (wi/4));
        Ellipse2D.Double body3 = new Ellipse2D.Double(xCoord+50, yCoord+50, ln - (ln/2), wi - (wi/2));
        Ellipse2D.Double body4 = new Ellipse2D.Double(xCoord+75, yCoord+75, ln - (ln/1.33), wi - (wi/1.33));
        Ellipse2D.Double body5 = new Ellipse2D.Double(xCoord+90, yCoord+90, ln - (ln/1.111), wi - (wi/1.111));
        */
       
        g2.setPaint(col);
        g2.fill(body1);
        g2.setPaint(col2);
        g2.fill(body2);
        g2.setPaint(col3);
        g2.fill(body3);
        g2.setPaint(col4);
        g2.fill(body4);
        g2.setPaint(col5);
        g2.fill(body5);
    }
    
}