public class HolidayPremierDemo {
	public static void main(String[] args){
	Holiday myHoliday1;
	Premier myPremier1;
	myHoliday1 = new Holiday("21/01/17","20/02/17","Maroco",2050);
	myPremier1 = new Premier("30/05/17","26/06/17","San Francisco", 4050,"Hilton",5,"Twin Picks");
	System.out.println("Your holiday starts: " + myHoliday1.getStartDate() 
	    + " and ends " + myHoliday1.getEndDate() + " at " + myHoliday1.getPlace()
	    + " costs " + myHoliday1.getPrice() +" pounds.");
	System.out.println("Your premium holiday starts: " + myHoliday1.getStartDate()
				+ " and ends " + myHoliday1.getEndDate() + " at " + myHoliday1.getPlace()
				+ " costs " + myHoliday1.getPrice() + " and your hotel is " +myPremier1.getHotelName() + " and graded "
				+ myPremier1.getHotelGrade() + " stars "+ "and resort name is " + myPremier1.getResortName() +" pounds.");
	
	}
}
