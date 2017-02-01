/**
 * Created by Ada on 2017-01-25.
 */
public class DemoBetterPremier {
    public static void main(String[] args) {
        BetterPremier myBetterPremier1, myBetterPremier2;
        myBetterPremier1 = new BetterPremier("", "", "", -1, "", 6, "");
//        myBetterPremier2 = new BetterPremier();
//        myBetterPremier2 = new BetterPremier("30/05/17", "26/06/17", "San Francisco", -1, "Hilton", 6, "Twin Picks");
        System.out.println("Your premium holiday starts: " + myBetterPremier1.getStartDate()
                + " and ends " + myBetterPremier1.getEndDate() + " at " + myBetterPremier1.getPlace()
                + " costs " + myBetterPremier1.getPrice() + " and your hotel is " +myBetterPremier1.getHotelName() + " and graded "
                + myBetterPremier1.getHotelGrade() + " stars "+ "and resort name is " + myBetterPremier1.getResortName() +" pounds.");

//        System.out.println("Your premium holiday starts: " + myBetterPremier2.getStartDate()
//                + " and ends " + myBetterPremier2.getEndDate() + " at " + myBetterPremier2.getPlace()
//                + " costs " + myBetterPremier2.getPrice() + " and your hotel is " +myBetterPremier2.getHotelName() + " and graded "
//                + myBetterPremier2.getHotelGrade() + " stars "+ "and resort name is " + myBetterPremier2.getResortName()+" pounds.");
    }
}
