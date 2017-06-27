import java.util.Scanner;

public class switchTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Math3 mat = new Math3();
		System.out.println("Enter first number: ");
		float x = scanner.nextFloat();
		System.out.println("Enter second number: ");
		float y = scanner.nextFloat();
		float answer = 0.0f;
		System.out.println("Addition = 1, Subtraction = 2, Multiply = 3, Divide = 4, Modulus = 5");
		System.out.println("What equation do you want to use?: ");
		int decision = scanner.nextInt();
		
		switch(decision){
			case 1: answer = mat.add(x, y);
					break;
			case 2: answer = mat.subtract(x, y);
					break;
			case 3: answer = mat.multiply(x, y);
					break;
			case 4: answer = mat.divide(x, y);
					break;
			case 5: answer = mat.modulo(x, y);
					break;
			default: System.out.println("Incorrect decision number entered.");
		}
		
		System.out.println("The answer is " + answer);
	}

}
