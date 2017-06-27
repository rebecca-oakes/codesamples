
public class Address {
	String street;
	String postcode;
	String city;
	
	public Address(String s, String pc, String c){
		street = "";
		postcode = "";
		city = "";
	}
	
	public void setStreet(String s){
		street = s;
	}
	public void setPostcode(String pc){
		postcode = pc;
	}
	public void setCity(String c){
		city = c;
	}
	public String getStreet(){
		return street;
	}
	public String getPostcode(){
		return postcode;
	}
	public String getCity(){
		return city;
	}
}
