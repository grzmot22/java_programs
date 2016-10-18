/* author grzmot22 17/10/2016
* This program counts circumference, area and volume of circle.
*/
public class Circle
{
	final static double PI = 3.142857; //(PI as a constant)
	public static void main(String[] args)
	{
		double radius = 7.5;
		circumference = 2 * PI * radius;
		area = PI * radius^2; //(the square of the radius, or radius * radius)
		volume = 4 * PI * radius * radius * radius / 3;
		String output1 = "Circumference of a circe is ";
		String output2 = "Area of a circe is ";
		String output3 = "Volume of a circe is ";
		System.out.println(output1 + circumference);
		System.out.println(output2 + area);
		System.out.println(output3 + volume);
	}
}
