
public class Bank {
	static float dollar;
	int x;
	
	public void setDollar(float a){
		dollar = a;
	}
	
	public void convertMoney(float m){
		System.out.println(m * dollar);
	}
	
	public void dollarRate(){
		System.out.println("Dollar: " + dollar);
	}
}
