public class List<E extends Comparable<E>> {
	private Node<E> head;
	private long size;
	public List(){head = null; size = 0;}
	public Node<E> getHead(){return head;}
	public void setHead(Node<E> node){head = node;}
	public boolean isEmpty(){return head == null;}
	public long size(){return size;}
	public void addFront(E s){
		head = new Node<E>(s,head);
		size ++;
	}
	public boolean equals(List<E> L){
		Node<E> p1 = head;
		Node<E> p2 = L.getHead();
		if (size != L.size) return false;
		while(p1 != null && p2 != null){
			if(!p1.equals(p2)){return false;}
			p1 = p1.getNext();
			p2 = p2.getNext();
		}
		return true;
	}
	public boolean isPresent(E s){
		Node<E> pointer = head;
		while(pointer != null){
			if (pointer.getElement().equals(s)) return true;
			pointer = pointer.getNext();
		}
		return false;
	}
	
	// alternative by Lewis
	
	public boolean isPresent(E s){
		for(Node<E> pointer = head; pointer !=null; pointer=pointer.getNext(){
			if (pointer.getElement().equals(s)) return true;
		}
		return false;
	}
	
	public List<E> intersect (List<E> L){
		List<E> returnList = new List<E>();
		Node<E> pointer = head;
		while (pointer != null){
			if(L.isPresent(pointer.getElement())){returnList.addFront(pointer.getElement());}
			pointer = pointer.getNext();
		}
		return returnList;
	}
	
	// alternative by Lewis
	
	public List<E> intersect (List<E> L){
		List<E> returnList = new List<E>();
		for(Node<E> pointer = head; pointer !=null; pointer=pointer.getNext(){
			if(L.isPresent(pointer.getElement()))returnList.addFront(pointer.getElement());
		}
		return returnList;
	}
}
