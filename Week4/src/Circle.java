import java.util.Scanner;

public class Circle {
	
		final static double PI = 3.142857;
		public Circle()
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
