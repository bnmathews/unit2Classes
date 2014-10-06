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
    private Color skycolor; 
    private boolean moon;
    
    public SkyBox(int x, int y, int width, int length, Color mainsky, boolean moon)
    {
        xCoord = x;
        yCoord = y;
        ln = length;
        wi = width;
        skycolor = mainsky;
        this.moon = moon;
    }
    
    public void draw(Graphics2D g2)
    {
        Rectangle2D.Double sky1 = new Rectangle2D.Double(0, 0, wi, ln);
        Ellipse2D.Double sun = new Ellipse2D.Double(xCoord, yCoord, 90, 90);
       
        g2.setPaint(skycolor);
        g2.fill(sky1);
        if (moon == false)
        {
            g2.setPaint(Color.YELLOW);
            g2.fill(sun);
        }
        else
        {
            g2.setPaint(Color.WHITE);
            g2.fill(sun);
        }
    }
    
}