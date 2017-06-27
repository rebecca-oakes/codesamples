
public class ContactDetails {
	String email;
	int phone;
	Address addressC;
	
	public ContactDetails(String e, int p, String s, String pc, String c){
		email = e;
		phone = p;
		addressC = new Address(s, pc, c); 
	}
	
	public void setEmail(String e){
		email = e;
	}
	
	public void setPhone(int p){
		phone = p;
	}
	
	public void setAddress(String s, String pc, String c){
		addressC.setStreet(s);
		addressC.setPostcode(pc);
		addressC.setCity(c);
	}
	
	public String getEmail(){
		return email;
	}
	
	public int getPhone(){
		return phone;
	}
	
	public Address getAddress(){
		return addressC;
	}
}
