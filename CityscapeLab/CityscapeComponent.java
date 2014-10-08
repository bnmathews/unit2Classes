import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these objects.
 * 
 * @author bnmathews
 * @version 8 October 2014
 */
public class CityscapeComponent extends JComponent
{
    private int step = 0;
    private int step2 = 0;
    private int step3 = 0;
    private int step4 = 0;
    private int steprev = 0;
    private int step2rev = 0;
    
    /**
     * Initializes all the objects to be drawn, as well as actually drawing them
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        //Step's calculations, starts with program, counts to and then reverses from 255
        if (steprev == 0)
            {
                if (step4 < 1)
                {
                    step = step + 1; // usually 4
                    step2 = 0;
                }
            } 
            
        if (steprev == 1)
            {
                step = step - 1;
            }
            
        if (step == 0)
            {
                steprev = 0;
            }
            
        if (step == 225) //Step starts reversing here
            {
                steprev = 1;
                
            }
            
        //Step 2's calculations, only begins if step is not running    
        if (step2rev == 0)
            {
                if (steprev == 0 && step == 0)
                {
                    step2 = step2 + 1;
                }
            } 
            
        if (step2rev == 1)
            {
                step2 = step2 - 1;
            }
            
        if (step2 == 0)
            {
                step2rev = 0;
            }
            
        if (step2 == 225) //Step2 starts reversing here
            {
                step2rev = 1;
                
            }
            
        //Step 3's calculations, only begins if step 4 is less than 1    
        if (step3 < 900)
            if (step4 < 1)
            {
                {
                    step3 = step3 + 2;
                } 
            }
            
        if (step3 == 900)
        {
                step3 = 0;
                step4 = step4 + 1;
        }
        
        //Step 4's calculations, only begins if step 3 hits 900
        if (step4 >= 1 && step4 < 900)
        {
            step4 = step4 + 2;
            step = 0;
        }
        else if (step4 == 901)
        {
            step4 = 0;
        }
        
<<<<<<< HEAD
        //Used to change the building's colors depending on the time of day
        int fbuildmult = 15 + (step / 20);
        int bbuildmult = 10 + (step / 20);
        
        //The front and back row building colors
        Color fbuildingcolor = new Color(2 * fbuildmult,2 * fbuildmult,2 * fbuildmult);
        Color bbuildingcolor = new Color(bbuildmult,bbuildmult,bbuildmult);
        
        //Color of the sky
        Color skycolor = new Color(step / 4,0,step);
        
        //The colors of a building's windowsill - just a bit brighter than the building itself
        Color fsillcolor = new Color(80 + fbuildmult,80 + fbuildmult,80 + fbuildmult);
        Color bsillcolor = new Color(70 + bbuildmult,70 + bbuildmult,70 + bbuildmult);
        
        //Roughly gets the brightness of the sky at the current frame
        int skybrightness = skycolor.getGreen() + skycolor.getRed() + skycolor.getBlue();
        
        //Very roughly gets how much color ISN'T in the sky
        int skydarkness = 255 - (skybrightness);

        if (skydarkness > 255)
        {
            skydarkness = 255;
        }
        
        if (skybrightness > 255)
        {
            skybrightness = 255;
        }
=======
        int fbuildingmult = rand.nextInt((18 - 10) + 1) + 10;
        int bbuildingmult = rand.nextInt((12 - 5) + 1) + 10;
        
        Color fbuildingcolor = new Color(2 * fbuildingmult,2 * fbuildingmult,2 * fbuildingmult);
        Color bbuildingcolor = new Color(bbuildingmult,bbuildingmult,bbuildingmult);
        Color skycolor = new Color(rand.nextInt(30-1),0,rand2.nextInt(200-1));
        
        Color fsillcolor = new Color(80 + fbuildingmult,80 + fbuildingmult,80 + fbuildingmult);
        
        Color bsillcolor = new Color(80 + bbuildingmult,80 + bbuildingmult,80 + bbuildingmult);
        
        int skybrightness = skycolor.getGreen() + skycolor.getRed() + skycolor.getBlue();
        //This gets the brighness of the sky, below 100 would be considered night
        
        int skydarkness = 255 - (skybrightness);
        
        int windowmult = 2 * skydarkness;
        
        //int streetmult = 
        
        if (windowmult >= 255)
        {
            windowmult = 245;
        }
        
        Color windowcolor = new Color(windowmult,windowmult,0);
        
        Color streetcolor = new Color(30+(skybrightness/5),30+(skybrightness/5),30+(skybrightness/5));
>>>>>>> origin/master
        
        //Determines how bright or dark to make the windows
        int windowmult = 2 * skydarkness;
        
        if (windowmult > 255)
        {
            windowmult = 255;
        }
        
        if (windowmult < 140)
        {
            windowmult = 140;
        }
        
<<<<<<< HEAD
        //Color for the windows, uses windowmult in the R and G areas to give a yellow color
        Color windowcolor = new Color(windowmult,windowmult,0);
        
        //Color of the street
        Color streetcolor = new Color(40 + (step / 10),40 + (step / 10),40 + (step / 10));
        
        //The sky - the sun uses step3 and step for its coordinates, while the moon uses step4 and step2
        //The actual background scales with the window (even though it doesn't really need to!)
        SkyBox s = new SkyBox(step3,300-(step),getWidth(),getHeight(),skycolor,step4,300-(step2));
=======
        Building b = new Building(50,340,100,200,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b2 = new Building(-60,320,100,220,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b3 = new Building(160,410,140,130,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        Building b4 = new Building(310,400,140,140,fbuildingcolor,windowcolor,fsillcolor,"single", "ac");
        Building b5 = new Building(460,300,120,240,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b6 = new Building(590,330,120,210,fbuildingcolor,windowcolor,fsillcolor,"revolving", "none");
        Building b7 = new Building(720,370,140,170,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        
        Building b8 = new Building(20,270,100,270,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b9 = new Building(140,260,100,280,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b10 = new Building(160,410,140,130,bbuildingcolor,windowcolor,bsillcolor,"single", "none");
        Building b11 = new Building(310,400,140,140,bbuildingcolor,windowcolor,bsillcolor,"single", "ac");
        Building b12 = new Building(460,300,120,240,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b13 = new Building(590,330,120,210,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b14 = new Building(720,370,140,170,bbuildingcolor,windowcolor,bsillcolor,"single", "none");
        
        Street str = new Street(0,540,getWidth(),30,streetcolor);
>>>>>>> origin/master
        
        //The front row of buildings
        Building b = new Building(50,340,100,200,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b2 = new Building(-60,320,100,220,fbuildingcolor,windowcolor,fsillcolor,"revolving", "ac");
        Building b3 = new Building(160,410,140,130,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        Building b4 = new Building(310,400,140,140,fbuildingcolor,windowcolor,fsillcolor,"single", "ac");
        Building b5 = new Building(460,300,120,240,fbuildingcolor,windowcolor,fsillcolor,"single", "ac");
        Building b6 = new Building(590,330,120,210,fbuildingcolor,windowcolor,fsillcolor,"revolving", "none");
        Building b7 = new Building(720,370,140,170,fbuildingcolor,windowcolor,fsillcolor,"single", "none");
        
        //The back row of buildings
        Building b8 = new Building(10,270,100,270,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b9 = new Building(130,260,100,280,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b10 = new Building(240,330,140,210,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        Building b11 = new Building(390,265,110,275,bbuildingcolor,windowcolor,bsillcolor,"single", "antenna");
        Building b12 = new Building(510,230,120,310,bbuildingcolor,windowcolor,bsillcolor,"revolving", "none");
        Building b13 = new Building(640,300,140,240,bbuildingcolor,windowcolor,bsillcolor,"revolving", "ac");
        
        //The street!
        Street str = new Street(0,540,getWidth(),30,streetcolor);
        
        //Draws the sky
        s.draw(g2);
        
<<<<<<< HEAD
        //Draws the back row of buildings
        b8.draw(g2);
        b9.draw(g2);
        b10.draw(g2);
        b11.draw(g2);
        b12.draw(g2);
        b13.draw(g2);
        
        //Draws the front row of buildings
        b.draw(g2);
        b2.draw(g2);
        b3.draw(g2);
        b4.draw(g2);
=======
        //Back row of buildings
        b8.draw(g2);
        b9.draw(g2);
        //b10.draw(g2);
        //b11.draw(g2);
        //b12.draw(g2);
        //b13.draw(g2);
        //b14.draw(g2);
        
        //Front row of buildings
        b.draw(g2);
        b2.draw(g2);
        //b3.draw(g2);
        //b4.draw(g2);
>>>>>>> origin/master
        b5.draw(g2);
        b6.draw(g2);
        b7.draw(g2);
        
<<<<<<< HEAD
        //Draws street
        str.draw(g2);
       
=======
        str.draw(g2);
>>>>>>> origin/master
    }

}
