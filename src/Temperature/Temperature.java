/*  The avg temperature 
 * 	Main Class
 *  Natali Boniel, 201122140 */

package Temperature;

import javax.swing.*;

public class Temperature {
	
	public static void main(String[] args) {
	        
	        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	        int year;
	        int temp;

	        SetTemperature myTemp = new SetTemperature();
	        
	        JOptionPane.showMessageDialog(null, "Welcome to the Average Temperatures Graph!", "Average Temperatures Graph", JOptionPane.PLAIN_MESSAGE);
	        
	        //Input year and monthly temperatures
	        year = Integer.parseInt(JOptionPane.showInputDialog("Enter a year"));
	        myTemp.setYear(year);
	        for (int i=0; i<12; i++)
	        {
	            temp = Integer.parseInt(JOptionPane.showInputDialog("Enter the average temperature at " + months[i]));
	            myTemp.setTemp(i,temp);
	        }
	        
	        //JFrame
	        JFrame frame = new JFrame("Average Temperatures Graph");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(992,450);
	        PrintTemperature P = new PrintTemperature(myTemp);
	        frame.add(P);
	        frame.setVisible(true);
	        
	    }
}
