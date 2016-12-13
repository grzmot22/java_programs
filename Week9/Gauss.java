import java.util.Scanner;

/*
* Program compute sum of all integers between 1 and the given number n (1+2+...+ n),
* using a for loop, and print this sum.
*
*@author Grzmot22
* @version 28.11.16
*/

public class Gauss {
    public static void main(String[] args) {
        int n;
        // int sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = keyboard.nextInt();
        if (n >= 0 && n <= 1) {
            System.out.println("You entered: " + n);
        } else if (n > 1) { //(1+2+3+n)
            //int n = 100;
            int sum = 0;

            for (int i = 0; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("You entered silnia: " + sum);
        } else if (n < 0) {
            System.out.println("You entered number less 0!!!");
        }
    }
}

