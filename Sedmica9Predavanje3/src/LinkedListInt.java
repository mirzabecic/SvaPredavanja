//trebamo public klasu node()
public class LinkedListInt {
	private Node head;
	private int size;

	public LinkedListInt() {
		head = null;
		size = 0;

	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null){
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while(current.next != null){
			current = current.next;
		}
		current.next = newNode;
		size++;
		
	}
	public void removeAt(int index){
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("Index is not in range");
		if(head.next == null){
			head = null;
			size--;
			return;
			
		}
		if (index == 0){
			head = head.next;
			size--;
			return;
		}
		Node current = head.next ;
		Node previous = head;
		int counter = 1;
		while (counter < index){
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		size--;
	}
	public void printList(){
		Node tmp = head;
		while (tmp != null){
			System.out.println(tmp.value);
		tmp = tmp.next;
		}
		
		
	}

	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;

		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}
	public void add(int value, int index){
		if (index < 0 || index > size){
			throw new IndexOutOfBoundsException("It must be within size");
		}
		Node newNode = new Node(value);
		if (index == 0){
			newNode.next = head;
			head = newNode;
			size++;
			return;
		}
		if(index == size){
			 add(value);
			 return;
		
	}
		
		Node previous = head;
		int counter = 1;
		while (counter < index){
			previous = previous.next;
			counter++;
		}
		newNode.next = previous.next;
		previous.next = newNode;

}
	public int [] toArray(){
		int [] temp = new int [size];
		Node node = head;
		for (int i = 0;i < size; i ++){
			temp[i] = node.value;
			node = node.next;
		}
			return temp;
			
		}
	public void add(LinkedListInt other){
		
	
		Node newNode = head;
		while (newNode != null){
			newNode = newNode.next;
			
		}
		newNode.next = other.head;
		this.size = other.size;
	}
	}
	 

