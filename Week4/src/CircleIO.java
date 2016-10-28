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
		System.out.println("Enter a radius of circle: ");
               double radius = keyboard.nextDouble();//collect number of radius from user
               double circumference = 2 * PI * radius; //Count circumference of a circle
               double area = PI * radius * radius; //Count area of a sphere
               double volume = 4 * PI * radius * radius * radius / 3; //Count volume of a sphere
		//Define strings
               String output1 = "Circumference of a circe is ";
               String output2 = "Area of a circe is ";
               String output3 = "Volume of a circe is ";
		//Print results using System.out.println()
               System.out.println(output1 + circumference);
               System.out.println(output2 + area);
               System.out.println(output3 + volume);
		//Print results using System.out.printf()
               System.out.printf(output1 + circumference +"\n");
               System.out.printf(output2 + area +"\n");
               System.out.printf(output3 + volume +"\n");

       }
}
