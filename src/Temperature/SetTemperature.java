/*  The avg temperature 
 * 	Calculation temperatures
 *  Natali Boniel, 201122140 */

package Temperature;

public class SetTemperature {

	final int M_SIZE = 13;
	private int[] avgTemp = new int[M_SIZE]; ;
	private int maxTemp = -1000;
	private int minTemp = 1000;
	
	public void setYear(int year)
	{
		avgTemp[M_SIZE-1] = year;
	}
	
	public void setTemp(int month, int temp)
	{
	    avgTemp[month] = temp;
	    if (temp > maxTemp)
	    	maxTemp = temp;
	    
	    if (temp < minTemp)
		    minTemp = temp;
	}
	
	public int getTemp(int month)
	{
	    return avgTemp[month];
	}
	
	public int getMaxTemp()
	{
	    return maxTemp;
	}
	
	public int getMinTemp()
	{
	    return minTemp;
	}
}

