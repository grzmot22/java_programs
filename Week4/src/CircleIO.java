import java.util.Scanner;

/**
 * The program  calculate
 *the circumference of a circle, its area and the volume of a sphere.
 *Display the radius and the results in a clear format using System.out.println() and
 *then System.out.printf().
 * @author Boguslaw Smolarczyk 1612761 
 * @version 24.10.16
 */

public class CircleIO {			
final static double PI = 3.142857;		
public CircleIO()		
{		
Scanner keyboard = new Scanner(System.in);		
double radius = keyboard.nextDouble();		
double circumference = 2 * PI * radius;		
double area = PI * radius * radius; //(the square of the radius, or radius * radius)		
double volume = 4 * PI * radius * radius * radius / 3;		
String output1 = "Circumference of a circe is ";		
String output2 = "Area of a circe is ";		
String output3 = "Volume of a circe is ";		
System.out.println(output1 + circumference);		
System.out.println(output2 + area);		
System.out.println(output3 + volume);		
System.out.printf(output1 + circumference +"\n");		
System.out.printf(output2 + area +"\n");		
System.out.printf(output3 + volume +"\n");	
}
}
