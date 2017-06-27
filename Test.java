
public class Test {

	public static void main(String[] args) {
		Math3 mat = new Math3();
		float x = 15.0f;
		float y = 2.0f;
		
		float a1 = mat.add(x, y);
		float a2 = mat.subtract(x, y);
		float a3 = mat.multiply(x, y);
		float a4 = mat.divide(x, y);
		float a5 = mat.modulo(x, y);
		
		System.out.println("The answer to the addition equation is: " + a1);
		System.out.println("The answer to the subtraction equation is: " + a2);
		System.out.println("The answer to the multiplication equation is: " + a3);
		System.out.println("The answer to the division equation is: " + a4);
		System.out.println("The answer to the modulus equation is: " + a5);
	}

}
