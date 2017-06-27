
public class Main {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		Divide d = new Divide();

		try{
			d.divide(a,b);
		}
		catch(MyException e){
			System.out.println("Can't divide by a number larger than itself");
		}
		catch(ArithmeticException e){
			System.out.println("You can't divide by zero, no matter how much you try");
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("Please enter two numbers as required");
		}
		catch(NumberFormatException e){
			System.out.println("Please enter only numeric values");
		}
	}
}
