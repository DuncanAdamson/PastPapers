public class Stack {
	private Object[] S;
	int tos = -1; // top of stack pointer
	int capacity;
	public Stack(int capacity){
		this.capacity = capacity;
		this.S = new Object[capacity];
	}
	public int size(){
		return -1;
	}
	public boolean isEmpty(){
		return false;
	}
	public boolean isFull(){
		return false;
	}
	public void push(Object o) throws Exception{
	
	}
	public Object top() throws Exception{
		return null;
	}
	public Object pop() throws Exception{
		return null;
	}
}
