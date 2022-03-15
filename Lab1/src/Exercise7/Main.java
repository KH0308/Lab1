package Exercise7;
import Exercise8.ArrayWeightList;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		
		
		CalculateHW calculateEarth = new CalculateHW();
		ArrayWeightList List = new ArrayWeightList();
		
		double[] newArrEarth = List.Earth();
		double[] newArrMars = List.Mars();
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Insert your weight(Kg): ");
			double weight = input.nextDouble();
			double EarthWeight = calculateEarth.calculateWeightEarth(weight);
			double MarsWeight = calculateEarth.calculateWeightMars(weight);
			
			newArrEarth[i] = EarthWeight;
			newArrMars[i] = MarsWeight; 
			
			System.out.println("Your weight on Earth(Kg) : "+newArrEarth[i]);
			System.out.println("Your Weight on Mars(Kg) : "+newArrMars[i]);
		}
	}
}