
public class Division {

	public static void main(String[] args) {
		int x, y, z;
		x=y=z=0;
		
		try{
			x = Integer.parseInt(args[0]);
			y = Integer.parseInt(args[1]);
			z = x / y;
			System.out.println("Result: " + z);
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
		catch(Exception e){
			System.out.println("There is some problem with the code");
		}
	}

}
