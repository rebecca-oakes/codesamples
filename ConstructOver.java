
public class ConstructOver {
	
	public ConstructOver(){
		this(5);
		System.out.println("Called constructor with no parameters");
	}
	
	public ConstructOver(int o){
		this(o, 9);
		System.out.println(o);
		System.out.println("Called constructor with one parameters");
	}
	
	public ConstructOver(int o, int c){
		System.out.println(o + ":" + c);
		System.out.println("Called constructor with two parameters");
	}
}
