/*  The avg temperature 
 * 	Print the avg temperature as a graph
 *  Natali Boniel, 201122140 */

package Temperature;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class PrintTemperature extends JPanel{
	
	private SetTemperature myTemp;
	
	public PrintTemperature(SetTemperature myTemp)
	{
		this.myTemp = myTemp;
	}
	
	public void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		
		String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		
		int width = getWidth();
	    int height = getHeight();
	    final int COOR_X = width/16;
	    final int COOR_Y = height/9;
	    final int tempRange = COOR_X;
	    int showTemp = 0;
		
	    int year;
	    int temp;
	    int maxTemp;
		int minTemp;
	    
	    //the background
	    g.setColor(Color.WHITE);
	    g.fillRect(0, 0, width, height);
	    g.setColor(Color.BLACK);
	    year = myTemp.getTemp(12);
	    g.drawString("The average temperature for the year " + year + ":", COOR_X*6, height-COOR_Y*8);
	    
        //the coordinate's line
        g.setColor(Color.BLACK); 
        g.drawLine(COOR_X*2, height-COOR_Y*2, width-COOR_X*2, height-COOR_Y*2); //line X
        g.drawLine(COOR_X*2, COOR_Y*2, COOR_X*2, height-COOR_Y*2); //line Y
	    
	    //the graph coordinate Y
	    g.setColor(Color.BLACK);
	    for (int i=0; i<5; i++)
	    { 
		    g.drawString("" + showTemp, COOR_X, height-COOR_Y*(i+2));
		    showTemp += tempRange;
	    }
	    
	    //the graph coordinate X
	    g.setColor(Color.BLACK);
	    for (int i=0; i<12; i++)
	    {
	     	g.drawString("" + months[i], COOR_X*(i+2)+COOR_X/9, height-COOR_Y);
	    }
	    
	    //the graph 
	    maxTemp = myTemp.getMaxTemp();
	    minTemp = myTemp.getMinTemp();
	    for (int i=0; i<12; i++)
	    {       
	    	g.setColor(Color.GRAY);
	        temp = myTemp.getTemp(i);	        
	        if (temp == maxTemp)
	        	g.setColor(Color.RED);  
	        if (temp == minTemp)
	        	g.setColor(Color.BLUE);
	        g.fillRect(COOR_X*(i+2), (height-COOR_Y*2)-temp, COOR_X/2, temp);     
	    }
	}
	
}


        