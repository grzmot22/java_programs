import java.util.Scanner;

/**
 * Created by grzmot22
 */
public class GreenBottles {
    private int bottles;
    private  int lessBottle;
    private  int failBottle;
    private  int bottlesLoop;
    public void tenGreenBottles() {
        bottles = 10;
        for (int i = -6; i <= bottles; i++) {
            lessBottle = bottles - 1;
            System.out.println(bottles + " green bottles standing on the wall,");
            System.out.println(bottles + " green bottles standing on the wall,");
            System.out.println("And if 1 green bottle should accidently fall,");
            System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
            bottles = bottles - 1;
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println("And if 1 green bottle should accidently fall,");
        System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
    }
    public  void xGreenBottles(int x) {
            bottles = x;
        for (int i = 0-(x-3); i <= bottles; i++) {
            bottlesLoop = bottles--;
            lessBottle = bottles;
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println("And if 1 green bottle should accidently fall,");
            System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println("And if 1 green bottle should accidently fall,");
        System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
    }
    public  void xyGreenBottles(int x, int y) {
        bottles = x;
        failBottle =y;
        for (int i = -(x/2)+((y*y));i <= bottles; i++) {
            bottlesLoop = bottles;
            lessBottle = bottles - failBottle;
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println("And if " +failBottle + " green bottle should accidently fall,");
            System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
            bottlesLoop = bottles-=failBottle;
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println("And if " +failBottle + " green bottle should accidently fall,");
        System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
    }
        public static void main(String[] args){
            GreenBottles myBottles = new GreenBottles();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("What you like to run:");
            System.out.println("Enter 1 to run 10 Green Bottles.");
            System.out.println("Enter 2 to run 40 Green bottles.");
            System.out.println("Enter 3 to run 50 Green Bottles with 5 fall.");
            System.out.println("Enter 4 to exit.");
               int choose = keyboard.nextInt();
               switch (choose){
                   case 1: {
                       myBottles.tenGreenBottles();
                   }
                   break;
                   case 2: {
                       myBottles.xGreenBottles(40);
                   }
                   break;
                   case 3: {
                       myBottles.xyGreenBottles(50,5);
                   }
                   break;
                   case 4: {
                       System.out.print("Bye!");
                   }
                   break;
                   default: {
                       System.out.println("You entered wrong number!");
                   }
               }
    }
}
