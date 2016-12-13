/**
 * Created by Grzmot22 on 2016-12-5.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Orders {
    String orderID;
			int leadTime;
			int orderSize;
public static Scanner input = new Scanner(System.in);

//public Orders(String orderI, int leadT, int orderS) {
//		orderID = orderI;
//		leadTime = leadT;
//		orderSize = orderS;
//		}
private static ArrayList<String> orderId = new ArrayList<String>();
private static ArrayList<Integer> leadTi = new ArrayList<Integer>();
private static ArrayList<Integer> orderSi = new ArrayList<Integer>();
private static  int  getOrderId(){
		for (int i = 0; i <10; i++){
			orderId.get(i);
		}
		return orderId.size();
		}
private static int  getLeadTime(){
		for (int i = 0; i <10; i++){
			leadTi.get(i);
		}
		return leadTi.size();
		}
public static int getOrderSize(){
		for (int i = 0; i <10; i++){
			orderSi.get(i);
		}
		return orderSi.size();
		}
public static int  list(){
		return getOrderId();
		}
public static void setOrderID(){
		for (int i = 0; i <10; i++){
			orderId.add(input.next());
		}
		}
private static int  setLeadTime(){
		for (int i = 0; i <10; i++){
			leadTi.add(input.nextInt());
		}
		return leadTi.size();
		}
public static int setOrderSize(){
		for (int i = 0; i <10; i++){
		orderSi.add(input.nextInt());
		}
		return orderSi.size();
		}
public  static void getAllData(){
		for (int i = 0; i <10; i++){
			System.out.println("Row " +(i+1));
			System.out.println(orderId.get(i)+", "+leadTi.get(i)+", "+orderSi.get(i));
//			System.out.println(orderId.get(i));
//			System.out.println(leadTi.get(i));
//			System.out.println(orderSi.get(i));
			}
		}
public static int getOrderSizeMean(){
		int sum= 0 , count = 0;
		for(int i = 0;i < list();i++){
			count++;
			sum = sum + orderSi.get(i);
		}
		int averageMean = sum / count;
//		System.out.println("Mean of order:" + averageMean);
		return averageMean;
		}

public static int getLeadTimeMean(){
		int sum= 0 , count = 0;
		for(int i = 0;i < list();i++){
			count++;
			sum = sum + leadTi.get(i);
		}
		int averageMean = sum / count;
//		System.out.println("Mean of lead time:" + averageMean);
		return averageMean;
		}
public static double getOrderSizeStandardDeviation(){
		int average = getOrderSizeMean();

		double sum = 0, temp = 0;
		for(int i = 0; i < list();i++){
			temp = Math.pow(orderSi.get(i) - average, 2);
			sum = sum + orderSi.get(i);

		}
		double averageStandardDeviation = sum / temp;
		double standardDeviation = Math.sqrt(averageStandardDeviation);
		return standardDeviation;
		}
public static double getLeadTimeStandardDeviation(){
		int average = getLeadTimeMean();
		double sum = 0, temp = 0;
		for(int i = 0; i < leadTi.size();i++){
			temp = Math.pow(leadTi.get(i) - average, 2);
			sum = sum + temp;
		}
		double averageStandardDeviation = sum / temp;
		double standardDeviation = Math.sqrt(averageStandardDeviation);
		return standardDeviation;
		}
public static void addRow(String orderID, int
		orderSize, int leadTime){
		orderId.add(orderID);
		orderSi.add(orderSize);
		leadTi.add(leadTime);

		}
}
