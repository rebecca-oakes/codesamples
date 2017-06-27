import java.util.Scanner;
public class digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number between 1 - 9999:");
		int digit = scanner.nextInt();
		int checkNum = checkNum(digit);
		String number;
		
		switch(checkNum){
			case 1: number = oneDigit(digit);
					break;
			case 2: number = twoDigits(digit);
					break;
			case 3: number = threeDigits(digit);
					break;
			case 4: number = fourDigits(digit);
					break;
			default: number = "Invalid number was entered.";
					break;
		}
		System.out.println(number);
	}
	
	public static int checkNum(int digit){
		int num = 0;
		
		if (digit <= 0)
			System.out.println("Invalid low number");
		else if (digit >= 1 & digit < 10)
			num = 1;
		else if (digit >= 10 & digit < 100)
			num = 2;
		else if (digit >= 100 & digit < 1000)
			num = 3;
		else if (digit >= 1000 & digit < 10000)
			num = 4;
		else
			System.out.println("Invalid high number");
		
		
		return num;
	}
	
	public static String oneDigit(int digit){
		String digitString = "";
		
		switch(digit){
			case 1: digitString = "one";
					break;
			case 2: digitString = "two";
					break;
			case 3: digitString = "three";
					break;
			case 4: digitString = "four";
					break;
			case 5: digitString = "five";
					break;
			case 6: digitString = "six";
					break;
			case 7: digitString = "seven";
					break;
			case 8: digitString = "eight";
					break;
			case 9: digitString = "nine";
					break;
		}
		
		return digitString;
	}
	
	public static String twoDigits(int digit){
		String digitNumber = "";
		
		if (digit < 20){
			if(digit == 10)
				digitNumber = "ten";
			else if(digit == 11)
				digitNumber = "eleven";
			else if(digit == 12)
				digitNumber = "twelve";
			else if(digit == 13)
				digitNumber = "thirteen";
			else if(digit == 15)
				digitNumber = "fifteen";
			else{
				int d = digit%10;
				digitNumber = oneDigit(d) + "teen";
			}
		}
		else{
			int firstDigit = digit/10;
			int secondDigit = digit%10;
			
			if(firstDigit == 2)
				digitNumber = "twenty";
			else if(firstDigit == 3)
				digitNumber = "thirty";
			else if(firstDigit == 4)
				digitNumber = "fourty";
			else if(firstDigit == 5)
				digitNumber = "fifty";
			else if(firstDigit == 6)
				digitNumber = "sixty";
			else if(firstDigit == 7)
				digitNumber = "seventy";
			else if(firstDigit == 8)
				digitNumber = "eighty";
			else if(firstDigit == 9)
				digitNumber = "ninety";
			
			if (secondDigit != 0)
				digitNumber = digitNumber + " " + oneDigit(secondDigit);
		}
		return digitNumber;
	}
	
	public static String threeDigits(int digit){
		String digitNumber = "";
		int firstDigit = digit/100;
		int remDigits = digit%100;
		
		digitNumber = oneDigit(firstDigit) + " hundred ";
		if (remDigits >= 10)
			digitNumber = digitNumber + twoDigits(remDigits);
		else 
			if (remDigits != 0)
				digitNumber = digitNumber + "and " + oneDigit(remDigits);
		
		return digitNumber;	
	}
	
	public static String fourDigits(int digit){
		String digitNumber = "";
		int firstDigit = digit/1000;
		int remDigits = digit%1000;
		
		digitNumber = oneDigit(firstDigit) + " thousand ";
		if (remDigits >= 100)
			digitNumber = digitNumber + threeDigits(remDigits);
		else if (remDigits >= 10)
			digitNumber = digitNumber + twoDigits(remDigits);
		else 
			if (remDigits != 0)
				digitNumber = digitNumber + "and " + oneDigit(remDigits); 
		
		return digitNumber;
	}

}