**
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

           // System.out.println(i); check
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
        for (int i = -(x-(y*y));i <= bottles; i++) {
            bottlesLoop = bottles-=failBottle;
            lessBottle = bottles - failBottle;
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println(bottlesLoop + " green bottles standing on the wall,");
            System.out.println("And if " +failBottle + " green bottle should accidently fall,");
            System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");

             System.out.println(i); //ckeck
            continue;
        }
        String lessBottle = "no";
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println(bottles + " green bottles standing on the wall,");
        System.out.println("And if " +lessBottle + " green bottle should accidently fall,");
        System.out.println("There’ll be " + lessBottle + " green bottles standing on the wall.");
    }
        public static void main(String[] args){
            GreenBottles myBottles = new GreenBottles();
         //   myBottles.tenGreenBottles();
         //   myBottles.xGreenBottles(40);
            myBottles.xyGreenBottles(40,2);
    }
}
