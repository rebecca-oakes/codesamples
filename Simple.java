
public class Simple {
	int x,y,z;
	String a,b,c;
	boolean yesno;
	
	public void message() {
		System.out.println("Hello");
	}
	public void printItOut(){
		System.out.println(a + " "+ b + " "+ c + ".");
	}
	public void trueFalse(){
		if (yesno == true)
			System.out.println("This fact is true!");
		else
			System.out.println("This fact is false!");
	}
}
