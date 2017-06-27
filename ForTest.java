import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What times table do you want to see?");
		int t = scanner.nextInt();
		System.out.println("To which multiple do you want to see the times table to?");
		int r = scanner.nextInt();
		TimesTables table = new TimesTables();
		table.createTable(t, r);
	}
}
