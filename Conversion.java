/* author grzmot22 17/10/2016
* This program convert kilometres to miles and miles to kilometres.
*/
public class Conversion
{
	public final double MILE_CONST = 1.609;
	public final double KILOMETRE_CONST = 0.621;
	
	public static void main(String[] args)
	{
		double kilometre = 23;
		double mile = 17;
		String output1 = "23 kilometres in miles is "
		String output2 = "17 miles in kilometres is "
		double convKilo = kilometre * KILOMETRE_CONST;
		double convMile = mile * MILE_CONST;
		System.out.println(output1 + convKilo + "/n" + output2 + convMile);
	}
}
