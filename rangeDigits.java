
public class rangeDigits {

	public static void main(String[] args) {
		range(145, 160);
	}
	
	public static void range(int a, int b){		
		Utility digits = new Utility();		
		
		for(int r = a; r <= b; r++){
			int rCheck = digits.checkDigits(r); 
			String rString = digits.calculateDigits(rCheck, r);
			System.out.println(rString);
		}
		
	}
}
