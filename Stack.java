
public class Stack {
	Object[] stack;
	static int pos;
	public void createStack(){
		stack = new Object[10];
		pos = -1;
	}
	
	public void pop(){
		if(pos < 0)
			System.out.println("Stack is empty");
		else{
			System.out.println(stack[pos]);
			pos--;
		}
	}
	
	public void push(Object item){
		if(pos < stack.length-1){
			pos++;
			stack[pos] = item;
		}
		else
			System.out.println("Stack is full!");
	}
	
	public void peek(){
		if(pos > 0)
			System.out.println(stack[pos]);
		else
			System.out.println("Stack is empty!");
	}
	
	public void clear(){
		pos = -1;
	}
}
