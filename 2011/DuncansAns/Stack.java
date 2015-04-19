public class Stack {
	private Object[] S;
	int tos = -1; // top of stack pointer
	int capacity;
	public Stack(int capacity){
		this.capacity = capacity;
		this.S = new Object[capacity];
	}
	public int size(){
		return tos + 1;
	}
	public boolean isEmpty(){
		return size() == 0;
	}
	public boolean isFull(){
		return size() == capacity;
	}
	public void push(Object o) throws Exception{
		if(size() == capacity){
			throw new Exception("Stack full");
		}
		tos ++;
		S[tos] = o;
	}
	public Object top() throws Exception{
		return S[tos];
	}
	public Object pop() throws Exception{
		if(tos == -1){
			throw new Exception("no value in stack");
		}
		Object pop = S[tos];
		S[tos] = null;
		tos --;
		return pop;
	}
}
