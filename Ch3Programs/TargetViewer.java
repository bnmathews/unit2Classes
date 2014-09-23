import javax.swing.JFrame;

public class TargetViewer
{
    public static void main(String[] args)
        throws InterruptedException
    {
        JFrame frame = new JFrame();
        
        frame.setSize(300,300);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TargetComponent component = new TargetComponent();
        
        frame.add(component);
        
        frame.setVisible(true);
        
        while (true)
        {
            component.repaint();
            Thread.sleep(200);
        }
    }
}
