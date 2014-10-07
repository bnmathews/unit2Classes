import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;

public class Street
{
    private int xCoord;
    private int yCoord;
    private int ln;
    private int wi;
    private Color col; 
    
    public Street(int x, int y, int width, int length, Color color)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double street = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        g2.setPaint(col);
        g2.fill(street);
        
    }
}