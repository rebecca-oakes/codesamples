import java.util.Random;

public class arrayMax {
	static int[] randArr;
	static int len = 20;
	
	public static void main(String[] args) {
		randArr = new int[len];
		fillArray();
		maxArr();
	}
	
	public static void fillArray(){
		Random rand = new Random();
		for(int i = 0; i < len; i++)
			randArr[i] = rand.nextInt(100);
	}
	
	public static void maxArr(){
		int max = 0;
		
		for(int m = 0; m < len; m++){
			if(randArr[m] > max)
				max =  randArr[m];
		}
		System.out.println("Highest number in array: " + max);
			
		for(int i = 1; i < 3; i++){
			int mini = 0;
			for(int m = 0; m < len; m++){
				if(randArr[m] < max  & randArr[m] > mini)
					mini =  randArr[m];
			}
			System.out.println("Next highest number in array: " + mini);
			max = mini;
		}
	}
}
