package RouletteSimulator;
/**
 * A code stub/template for a simple GUI
 * - This file has the component which will
 *   contain the graphics.
 * 
 * @author Robert Nguyen
 * @version 11/25/2019
 */
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.awt.Color;

public class RouletteComponent extends JComponent
{
    // Make instance variable(s) to hold references to
    // any objects you need to refer to.
    private Rectangle r;
    private JButton n1;
    private int boxCounter = 0;
    private static final Set<Integer> blackvalues = new HashSet<Integer> (Arrays.asList(2,4,6,8,11,12,13,15,17,20,22,24,26,29,30,31,33,35));
    private static final Set<Integer> redvalues = new HashSet<Integer> (Arrays.asList(1,3,5,7,9,10,14,16,18,19,21,23,25,27,28,32,34,36));
    // Overload the constructor to pass reference(s) to 
    // any objects that you need to refer to.
    public RouletteComponent(Rectangle newRect)
    { 
        r = newRect;
    }
    public void paintComponent(Graphics g)
    {
    	       
        for (int i = 0; i <=1200; i+= 100) 
        {
        	for (int j = 0; j <= 200; j+=100)
        	{
        	
        	g.drawRect(i, j, 100, 100);
        	boxCounter++;
        	
        	if (blackvalues.contains(boxCounter))
        	{
        		g.setColor(Color.BLACK);
        		g.fillRect(i, j, 100-2, 100-2);
        	}
        	if (redvalues.contains(boxCounter))
        	{
            	g.setColor(Color.RED);
            	g.fillRect(i, j, 100-2, 100-2);
        	}
        	}
        }
        g.setColor(Color.BLACK);
        g.drawRect(400, 300, 200, 100);
        g.drawRect(600, 300, 200, 100);
        
        g.setColor(Color.RED);
        g.fillRect(400, 300, 200-2, 100-2);
        
        g.setColor(Color.BLACK);
        g.fillRect(600, 300, 200-2, 100-2);
    }
}
