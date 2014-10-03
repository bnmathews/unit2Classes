import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;
import java.awt.Color;

public class SkyBox extends JComponent
{
    private int xCoord;
    private int yCoord;
    private int ln;
    private int wi;
    private Color col; 
    
    public SkyBox(int x, int y, int width, int length, Color color)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        col = color;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        Rectangle2D.Double sun = new Rectangle2D.Double(xCoord, yCoord, wi, ln);
        
        g2.setPaint(Color.BLUE);
        g2.fill(sky);
        g2.setPaint(Color.YELLOW);
        g2.fill(sun);
    }
    
}