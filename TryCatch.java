
public class TryCatch {

	public static void main(String[] args) {
		int x;
		 
		try{
			x = 4/0;
			System.out.println("Result: " + x);
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide by 0 no matter how much you want to");
		}
	}

}
