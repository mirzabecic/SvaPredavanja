public class LinkedListInt {
	private Node head;
	int size;

	public LinkedListInt() {

	}

	private class Node {
		public int value;
		public Node next;

		public Node(int value) {
			this.value = value;
			next = null;

		}

	}

	public void add(int value) {
		Node newNode = new Node(value);
		if (head == null) {
			head = newNode;
			size++;
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		size++;

	}

	public String toString() {
		Node current = head;
		String elements = new String();
		for (int i = 0; i < size; i++) {
			if (current.next == null) {
				elements += current.value;
			} else {
				elements += current.value + ", ";
				current = current.next;
			}
		}
		return "Elements of array list: [" + elements + "].";
	}

	public void remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index nije validan!");
		}
		if (index == 0) {
			head = head.next;
			size--;
			return;
		}
		Node current = head.next;
		Node previous = head;
		int counter = 1;
		while (counter != index) {
			current = current.next;
			previous = previous.next;
			counter++;
		}
		previous.next = current.next;
		current.next = null;
		size--;
	}
	public void addAt(int value, int index){
		if (index == size){
		add(value);
		return;
		}
		Node previous = head;
		int counter = 1;
		while(counter != index){
			previous = previous.next;
			counter++;
		}
		Node newNode = new Node(value);
		newNode.next = previous.next;
		previous = newNode;
		size ++;
		
	}
}
