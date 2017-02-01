
public class BackPacker extends Holiday{
private String country;
private String hostel;
private double hostelPrice;
public void setCountry(String country){
	this.country = country;
}
public String getCountry(){
	return country;
}
public void setHostel(String hostel){
	this.hostel = hostel;
}
public String getHostel(){
	return hostel;
}
public void setHostelPrice(Double hostelPrice){
	this.hostelPrice = hostelPrice;
}
public Double getHostelPrice(){
	return hostelPrice;
}
BackPacker(){
	country = "Poland";
	hostel = "Pod baranami";
	hostelPrice = 59.9;
}
BackPacker(String startDate,String endDate,String place, double price,String hostel,double hostelPrice,String country){
super(startDate,endDate,place,price);
this.hostel = hostel;
this.hostelPrice = hostelPrice;
this.country = country;
}

}
