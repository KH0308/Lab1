package Exercise8;
import Exercise7.CalculateHW;
import java.util.ArrayList;

public class ArrayWeightList {
	
	double[] arrayEarth = new double[5];
	double[] arrayMars = new double[5];
		
	public ArrayWeightList()
	{
			
	}
		
	public double[] Earth()
	{
		return arrayEarth.clone();
	}
	
	public double[] Mars()
	{
		return arrayMars.clone();
	}
}
