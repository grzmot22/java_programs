
/**
 * Created by Grzmot22 on 2016-12-5.
 */
public class Order {

    public static void main(String[] args){
//        System.out.println("Enter  10 order id:");
//        setOrderID();
//        System.out.println("Enter  10 lead time:");
//        setLeadTime();
//        System.out.println("Enter  10 order size:");
//        setOrderSize();
        for(int i = 0; i< 10; i++){
            System.out.println("Add "+(i+1)+" row:");
            Orders.addRow(Orders.input.next(),Orders.input.nextInt(),Orders.input.nextInt());
        }
        Orders.getAllData();
        System.out.println("Thank you. \nMean of order size is: " + Orders.getOrderSizeMean());
        System.out.println("Standard deviation of order size: " + Orders.getOrderSizeStandardDeviation());
        System.out.println("Mean of lead time is: " + Orders.getLeadTimeMean());
        System.out.println("Standard deviation of lead time is: " + Orders.getLeadTimeStandardDeviation());

    }
}
