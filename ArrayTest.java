import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int[] iArr = new int[5];
		
		iArr[0] = 7;
		iArr[1] = 1;
		iArr[2] = 15;
		iArr[3] = 9;
		iArr[4] = 11;
		
		maxArr(iArr);
		minArr(iArr);
		sortArr(iArr);
	}
	
	public static void maxArr(int[] iArr){
		int max = iArr[0];
		
		for(int m = 1; m < iArr.length; m++){
			if(iArr[m] > max)
				max = iArr[m];
		}
		System.out.println("Max: " + max);
	}
	
	public static void minArr(int[] iArr){
		int min = iArr[0];
		
		for(int m = 1; m < iArr.length; m++){
			if(iArr[m] < min)
				min = iArr[m];
		}
		System.out.println("Min: " + min);
	}
	
	public static void sortArr(int[] iArr){
		int temp;
		boolean sorted = false;
		int count = 0;
		
		while(sorted == false){
			for(int i = 0; i < iArr.length-1; i++){
				if (iArr[i] > iArr[i+1]){
					temp = iArr[i+1];
					iArr[i+1] = iArr[i];
					iArr[i] = temp;
				}
			}
			count++;
			if(count == iArr.length)
				sorted = true;
		}
		System.out.println("Sorted: " + Arrays.toString(iArr));
	}

}
