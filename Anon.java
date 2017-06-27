abstract class AnonInner{
	public abstract void innerMethod();
}

public class Anon {

	public static void main(String[] args) {
		AnonInner an = new AnonInner(){
			public void innerMethod(){
				System.out.println("This is an example of an inner annonymous class");
			}
		};
		an.innerMethod();
	}
}
