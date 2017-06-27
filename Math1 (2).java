
abstract public class Math1 {
	abstract public void Addition(int a, int b);
	
	abstract public void Subtraction(int a, int b);
	
	public void Division(int a, int b){
		System.out.println(a / b);
	}
	
	final public void Multiplication(int a, int b){
		System.out.println("Result of multiplication: " + (a * b));
	}
}
