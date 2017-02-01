public class DemoHoliday {
	public static void main(String[] args){
		Holiday myHoliday1, myHoliday2;
		myHoliday1 = new Holiday("21/01/17","20/02/17","Maroco",2050);
		System.out.println("Your holiday starts: " + myHoliday1.getStartDate()
				+ " and ends " + myHoliday1.getEndDate() + " at " + myHoliday1.getPlace()
				+ " costs " + myHoliday1.getPrice() +" pounds.");
		myHoliday2 = new Holiday("30/05/17","26/06/17","San Francisco", 4050);
		System.out.println("Your holiday starts: " + myHoliday2.getStartDate()
				+ " and ends " + myHoliday2.getEndDate() + " at " + myHoliday2.getPlace()
				+ " costs " + myHoliday2.getPrice() +" pounds.");
	}
}
