
public class Basic {

	public static void main(String[] args) {
		Simple one;
		one = new Simple();
		
		one.x = 15;
		one.y = 24;
		one.z = one.x + one.y;
		one.a = "Hello";
		one.b = "My Name is";
		one.c = "Minnie Mouse";
		one.yesno = false;		
		
		if (one.x < one.y)
			one.yesno = true;
		
		System.out.println(one.z);
		one.message();
		one.printItOut();
		one.trueFalse();
	}

}
