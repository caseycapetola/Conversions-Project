
public class Conversions 
{

	public static void main(String[] args) 
	{
		System.out.println("8 ft = " + feetToInches(8) + " in");
		System.out.println("3 mi = " + milesToFeet(3) + " ft");
		System.out.println("5 yds = " + yardsToMeters(5) + " m");
		System.out.println("70 lbs = " + poundsToKilograms(70) + " kg");

	}

	public static double feetToInches(double ft1)
	{
		double inReturn = ft1*12;
		return inReturn;
	}
	
	public static double milesToFeet(double mi1)
	{
		double ftReturn = mi1*5280;
		return ftReturn;
	}
	
	public static double yardsToMeters(double yd1)
	{
		double mtrReturn = yd1/1.094;
		return mtrReturn;
	}
	
	public static double poundsToKilograms(double lbs1)
	{
		double kgReturn = lbs1/2.205;
		return kgReturn;
	}
}
