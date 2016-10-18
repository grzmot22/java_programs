
/* author grzmot22 10/10/2016
* This program convert galons to litres.
*/

public class VolumeConversion
{
    public static final double galon = 4.546; //Define galon sa constant.
    //Need be outside the main class.
    
    public static void main(String [] args)
    {
         double galonVal = 14;
         double litre = galon * galonVal; // calculation
        System.out.println("The number of litres in " + litre + " gallons is " + galonVal);
        //print output
    }
}
 

