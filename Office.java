
public class Office {
	int ni;
	int salary;
	int grade;
	Address addressO;
	
	public Office(int n, int sal, int g, String s, String pc, String c){
		ni = n;
		salary = sal;
		grade = g;
		addressO = new Address(s, pc, c);
	}
	

	public void setNI(int n){
		ni = n;
	}
	
	public void setPhone(int sal){
		salary = sal;
	}
	
	public void setGrade(int g){
		grade = g;
	}
	
	public void setAddress(String s, String pc, String c){
		addressO.setStreet(s);
		addressO.setPostcode(pc);
		addressO.setCity(c);
	}
	
	public int getNI(){
		return ni;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public int getGrade(){
		return grade;
	}
	
	public Address getAddress(){
		return addressO;
	}
}
