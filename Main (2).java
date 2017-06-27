
public class Main {

	public static void main(String[] args) {
		Bank nw, rbs, hsbc;
		nw = Bank.createBank();
		rbs = Bank.createBank();
		
		nw.setDollar(15);
		rbs.convertMoney(100);
		hsbc = Bank.createBank();
		nw.convertMoney(100);
	}

}
