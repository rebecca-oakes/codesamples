
public class Divide {

	public static void divide(int a, int b) throws MyException{
		
		if( a < b){
			MyException e = new MyException();
			throw e;
		}
		System.out.println(a/b);
	}
	
}
