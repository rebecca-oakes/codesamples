import java.util.Scanner;

public class BillPayment {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How much is to be paid?");
		double bill = scanner.nextDouble();
		System.out.println("How much has the customer given?");
		double payment = scanner.nextDouble();
		double change = payment - bill;
		change = change * 100;
		int notes = (int) (change/100);
		int coins = (int) (change%100);
		int[] chArr = new int[12];
		
		calculateChange(notes, coins, chArr);
		displayChange(chArr);
	}
	
	public static void calculateChange(int notes, int coins, int[] chArr){
		while(notes > 0){
			if (notes >= 50){
				chArr[0]++;
				notes = notes - 50;
			}
			else if (notes >= 20){
				chArr[1]++;
				notes = notes - 20;
			}
			else if (notes >= 10){
				chArr[2]++;
				notes = notes - 10;
			}
			else if (notes >= 5){
				chArr[3]++;
				notes = notes - 5;
			}
			else if (notes >= 2){
				chArr[4]++;
				notes = notes - 2;
			}
			else if (notes >= 1){
				chArr[5]++;
				notes = notes - 1;
			}
		}
		while(coins > 0){
			if (coins >= 50){
				chArr[6]++;
				coins = coins - 50;
			}
			else if (coins < 50 & coins >= 20){
				chArr[7]++;
				coins = coins - 20;
			}
			else if (coins < 20 & coins >= 10){
				chArr[8]++;
				coins = coins - 10;
			}
			else if (coins < 10 & coins >= 5){
				chArr[9]++;
				coins = coins - 5;
			}
			else if (coins < 5 & coins >= 2){
				chArr[10]++;
				coins = coins - 2;
			}
			else if (coins < 2 & coins >= 1){
				chArr[11]++;
				coins = coins - 1;
			}
		}
	}
	
	public static void displayChange(int[] chArr){
		String[] moneyArray = new String[] {"£50", "£20", "£10", "£5", "£2", "£1", "50p", "20p", "10p", "5p", "2p", "1p"};
		
		for (int i = 0; i <= moneyArray.length-1; i++){
			System.out.println(moneyArray[i] + ": " + chArr[i]);
		}
	}
}