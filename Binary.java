import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number:");
		int num = scanner.nextInt();
		
		String bNum = decToBin(num);
		binToDec(bNum);
		System.out.println("The number in ASCII is: " + asciiChar(num));
	}
	public static String decToBin(int num){
		String bNum = "";
		
		while(num > 0){
			bNum = num%2 + bNum;
			num = num/2;
		}
		System.out.println("The number is binary is: " + bNum);
		return bNum;
	}
	
	public static void binToDec(String bString){
		int num = bString.length();
		int[]binArray = new int[num];
		int count = 1;
		int j = 0;
		int dNum = 0;
		
		// Take a character from the string, convert into int and store in array
		for (int i = num -1; i >= 0; i--){
			binArray[i] = Character.getNumericValue(bString.charAt(i));
		}
		
		reverseArray(binArray, num);
		
		// binary to decimal
		while(j < num){
			binArray[j] = binArray[j] * count;
			count = count * 2;
			j++;
		}
		
		for(int n = num - 1; n >= 0; n--){
			dNum = dNum + binArray[n];
		}
		System.out.println("Then converted back: " + dNum);
	}
	
	public static void reverseArray(int[] binArray, int num){
		int start=0,end=num - 1;
        while(start<=end)
        {
            int temp=binArray[start];
            binArray[start]=binArray[end];
            binArray[end]=temp;
            start++;
            end--;
        }
	}
	
	public static char asciiChar(int num){
		return (char)num;
	}
}
