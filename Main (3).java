
public class Main {

	public static void main(String[] args) {
		callStack();
		callMap();
	}

	public static void callStack(){
		Stack s = new Stack();
		s.createStack();
		
		s.push("x");
		s.push("y");
		s.push("z");
		s.pop();
		s.push(1);
		s.push(2);
		s.push(3);
		s.pop();
		s.push(0.5);
		s.push(0.01);
		s.pop();
		s.push("k1");
		s.push("m2");
		s.push("f3");
		s.pop();
		s.pop();
		s.peek();
		s.clear();
		s.peek();
	}
	
	public static void callMap(){
		Map m = new Map();
		m.createMap(5);
		m.add(1, "Fifty");
		m.add(2, 45);
		m.add(3, "value");
		m.add(2, 85);
		
		m.find(2);
		m.add(4, 100/2);
		m.add(5, "stringf");
		m.containsValue("stringf");
		
		m.mapKey(3, "key");
		m.find(3);
	}
}
