
public class OverloadTest {

	public static void main(String[] args) {
		int A =  10;
		int B = 25;
		int C = 100;
		
		Add(A);
		Add(A, B);
		Add(A, B, C);
	}
	
	public static void Add(int A){
		System.out.println(A + 10);
	}
	
	public static void Add (int A, int B){
		System.out.println(A + B);
	}
	
	public static void Add(int A, int B, int C){
		System.out.println(A+B+C);
	}
}
