/* author grzmot22 17/10/2016
* This program shows how works modulo operator ("%").
*/
public class OddOrEven
{
	public static void main(String[] args)
	{
		int remainder = 17%3;
		System.out.println("17 is odd or even?"); 
			if(remainder > 0){
			System.out.println("17 is odd.");
		}
		else{
			System.out.println ("17	is even.");
		}
	}
}
