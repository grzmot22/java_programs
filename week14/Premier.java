public class Premier extends Holiday{
	private int hotelGrade;
	private String hotelName;
	private String resortName;
	
	public void setHotelGrade(int hotelGrade){
		this.hotelGrade = hotelGrade;
	}
	public int getHotelGrade(){
		return hotelGrade;
	}
	public void setHotelName(String hotelName){
		this.hotelName = hotelName;	
	}
	public String getHotelName(){
		return hotelName;
	}
	public void setResortName(String resortName){
		this.resortName = resortName;
	}
	public String getResortName(){
		return resortName;
	}
	public Premier(){
		this.hotelGrade = 5;
		this.hotelName = "";
		this.resortName = "";
	}
	public Premier(String startDate,String endDate,String place, double price,String hotelName, int hotelGrade, String resortName){
		super(startDate,endDate,place,price);
		this.setHotelName(hotelName);
		this.setHotelGrade(hotelGrade);
		this.setResortName(resortName);
	}
}
