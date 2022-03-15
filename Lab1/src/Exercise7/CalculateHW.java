package Exercise7;
public class CalculateHW {
	
	private double mass;
	private double weightMars;
	private double weightEarth;
	
	public CalculateHW(){}
	
	public CalculateHW(double mass)
	{
		this.mass = mass;
	}
	
	public double calculateWeightMars(double mass)
	{
		this.weightMars = mass * 0.38;
		return weightMars;
	}
	
	public double calculateWeightEarth(double mass)
	{
		weightEarth = mass * 1;
		return weightEarth;
	}
}