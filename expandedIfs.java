
public class expandedIfs {

	public static void main(String[] args) {
		int num = 4900;
		
		if(num > 4000){
			System.out.println("A");
			num+=100;
			if (num > 5000){
				System.out.println("B");
				System.out.println("C");
			}
			else
				System.out.println("D");
			System.out.println("E");
		}
		else {
			num+=1000;
			System.out.println("F");
			System.out.println("G");
			if(num < 500)
				System.out.println("J");
			else {
				System.out.println("H");
				System.out.println("I");
			}
			System.out.println("K");
		}
		System.out.println("L");

	}

}
