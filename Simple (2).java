import java.util.Scanner;
public class Simple {

	public static void main(String[] args) {
		Math3 mat = new Math3();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = scanner.nextInt();
		System.out.println("Enter another number: ");
		int b = scanner.nextInt();
		
		mat.Addition(a, b);
		mat.Subtraction(a, b);
		mat.Division(a, b);
		mat.Multiplication(a, b);
		mat.Modulus(a, b);
		
		scanner.close();
	}

}
