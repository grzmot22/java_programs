/** LogicalOperators1.java
	Use of &&, || and !
	Des, 18th October 2000
*/
public class LogicalOperators1 
{
	public static void main(String [] args) 
	{
		int x = 12;
		int y = 12;
		boolean z = false;
		boolean a = false;
		boolean b = false;
		z = (x == y) && (y != ++x);
		System.out.println("z = " + z+ " x = " + x + " y = " + y);
		a = (x <= y);
		b = (x > ++y);
		z = a && b;
		System.out.println("z = " + z+ " x = " + x + " y = " + y);
		z = (x <= y) || !(x > ++y);
		System.out.println("z = " + z + " x = " + x + " y = " + y);
	}
}
