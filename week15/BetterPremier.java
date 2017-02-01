public class BetterPremier  extends Premier{

	BetterPremier(String startDate,String endDate,String place, double price,String hotelName, int hotelGrade, String resortName){
		super(startDate,endDate,place,price,hotelName,hotelGrade,resortName);
	}
//	BetterPremier(){
//	    super.setStartDate("");
//	    super.setEndDate("");
//	    super.setPlace("");
//	    super.setPrice(0);
//	    super.setHotelName("");
//	    super.setHotelGrade(0);
//	    super.setResortName("");
//    }
		public  void setHotelName(String hotelName) {
		if (hotelName !="") {
			super.setHotelName(hotelName);
		} else {
			System.out.println("Write the hotel name.");
		}
	}
		public void setResortName(String resortName){
			if (resortName !=""){
				super.setResortName(resortName);
				} else{
				System.out.println("Write resort name.");
			}
		}
		public  void  setPrice(double price){
			if (price > 0){
				super.setPrice(price);
			} else {
				System.out.println("You typed wrong price.");
			}
		}
		public void setHotelGrade(int hotelGrade){
		    if (hotelGrade>=1 & hotelGrade<=5){
		        super.setHotelGrade(hotelGrade);
            } else {
                System.out.println("You typed wrong hotel grade.");
            }
        }
        public void setPlace(String place){
        if (place !="") {
            super.setPlace(place);
        } else {
            System.out.println("Write the place name.");
            }
        }
    public void setStartDate(String startDate){
        if (startDate !="") {
            //check hotel grade, price
            super.setStartDate(startDate);
        } else {
            System.out.println("Write the start date.");
        }
    }
    public void setEndDate(String endDate){
        if (endDate !="") {
            //check hotel grade, price
            super.setStartDate(endDate);
        } else {
            System.out.println("Write the end date.");
        }
    }
}
