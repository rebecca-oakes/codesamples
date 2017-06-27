
public class StaticTest {

	public static void main(String[] args) {
		Bank nw, rbs;
		nw = new Bank();
		rbs = new Bank();
		
		nw.setDollar(50.0f);
		rbs.dollarRate();
		rbs.setDollar(75.0f);
		nw.convertMoney(5.0f);
	}

}
