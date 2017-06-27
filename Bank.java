
public class Bank {
	static int count = 0;
	static Bank b;
	static int dollar;
	
	private Bank(){
		System.out.println("Bank Created");
	}
	
	static{
		dollar = 15 + 1 + 10;
	}
	
	public static Bank createBank(){
		if(count < 3){
			b = new Bank();
			count++;
			return b;
		}
		else{
			System.out.println("Bank Not Created");
			return null;
		}
	}
	
	public void setDollar(int m){
		dollar = m;
	}
	
	public void convertMoney(int m){
		System.out.println(m * dollar);
	}
}
