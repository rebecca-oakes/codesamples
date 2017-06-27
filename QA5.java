class QA5{
	public static void main (String args []){
		int first;
		int second;
		int counter;
		
		first = 10;
		second = 100;
		counter = 0;
		
		while (first != second){
			if(first == second){
				break;
			}
			else if (first < second){
				counter++;
				second = second - first;
			}
		}
		System.out.println("Counter is " + counter);
	}
}