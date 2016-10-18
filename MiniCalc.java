/*
 * A mini calculator demo
 */
public class MiniCalc {


    /*
     * Constructor
     */
	public MiniCalc(){
		int int3 = add(1,2);
		int int4 = multiply(5,4);
		System.out.println(int3+" "+int4);
	}

	/*
	 * Add two values
	 */
	public int add(int int1, int int2){
		return int1 + int2;
	}
	
	/*
	 * Multiply two values
	 */
	public int multiply(int int1, int int2){
		return int1 * int2;
	}
	
	
	/*
	 * The main method
	 */
	public static final void main(String[] str) {
		System.out.println("MiniCalc");
		MiniCalc mc = new MiniCalc();
	}
}