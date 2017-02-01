public class Holiday {
	private String startDate; 	
	private String endDate;
	private String place;
	private double price;

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	public String getStartDate(){
		return startDate;
	}
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}
	public String getEndDate(){
		return endDate;
	}
	public void setPlace(String place){
		this.place = place;
	}
	public String getPlace(){
		return place;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public Holiday(){
		startDate = "";
		endDate = "";
		place = "";
		price = 0;
	}

	public Holiday(String startDate,String endDate,String place, double price)
	{
		this.setStartDate(startDate);
		this.setEndDate(endDate);
		this.setPlace(place);
		this.setPrice(price);
	}
	//TODO spr to kiego mi to
	public boolean equals(Holiday obj) {
 		if (startDate.equals(obj.getStartDate()) 
 		&& endDate.equals(obj.getEndDate())
 		&& place.equals(obj.getPlace()) 
 		&& price ==obj.getPrice())  
 		{
 			System.out.println("Object states are equal");
 			return true;
 		}
 		else  {
 			System.out.println("Object states are NOT equal");
 			return false;
 		}
	}
}