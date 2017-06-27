
public class nesting {

	public static void main(String[] args) {
		simpleNest();
		nestedFor();
	}
	
	public static void simpleNest(){
		int A = 1;
		
		while (A <= 10){
			int B = 1;
			while (B <= 10){
				System.out.println(B);
				B++;
			}
			A++;
		}
	}
	
	public static void nestedFor(){
		for (int n = 1; n <= 10; n++){
			if (n % 2 == 0)
				System.out.println(n);
			else{
				for(int i = 1; i <= n; i++)
					System.out.print(i);
				System.out.println("");
			}
		}
	}
}
