import java.util.Scanner;
public class addingDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number to be added:");
		int num = scanner.nextInt();
		
		if(num < 10 & num >= 0)
			System.out.println(num);
		else if(num >= 10 & num < 100)
			twoDigits(num);
		else if(num>=100 && num<1000)
			threeDigits(num);
		else if(num>=1000 && num<10000)
			fourDigits(num);
		else if(num>=10000 && num<100000)
			fiveDigits(num);
		else
			System.out.println("This number is too large or too small for this system.");
	}
	public static void twoDigits (int num) {
		int n1 = num/10;
		int n2 = num%10;
		
		System.out.println(n1 + n2);
	}
	
	public static void threeDigits(int num) {	
		int n1 = num%10;
		num = num/10;
		int n2 = num/10;
		int n3 = num%10;
		
		System.out.println(n1 + n2 + n3);
	}
	
	public static void fourDigits(int num){
		int n1 = num%10;
		num = num/10;
		int n2 = num%10;
		num = num/10;
		int n3 = num%10;
		int n4 = num/10;
		
		System.out.println(n1 + n2 + n3 + n4);
	}
	
	public static void fiveDigits(int num){
		int n1 = num%10;
		num = num/10;
		int n2 = num%10;
		num = num/10;
		int n3 = num%10;
		num = num/10;
		int n4 = num/10;
		int n5 = num%10;
	
		System.out.println(n1 + n2 + n3 + n4 + n5);
	}
}
