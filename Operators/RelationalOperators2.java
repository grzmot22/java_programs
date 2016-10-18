/** RelationalOperators2.java
	Use of <, >, >= and <=
	Des, 18th October 2000
*/
public class RelationalOperators2 
{
	public static void main(String [] args) 
	{
		int x = 13;
		int y = 12;
		boolean z = false;
		z = x >= y;
		System.out.println("z = " + z);	// Predict output
		z = x >= y + 2;					// Which operator has precedence?
		System.out.println("z = " + z);
	}
}
