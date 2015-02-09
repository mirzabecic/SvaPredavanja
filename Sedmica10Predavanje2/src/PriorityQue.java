public class PriorityQue {
	private IntNode head;
	private IntNode tail;

	private static class IntNode {
		private int value;
		private IntNode next;
		private int priority;

		public IntNode(int value, int priority) {
			this.value = value;
			this.priority = priority;

		}

		public int getValue() {
			return value;
		}

		public IntNode getNext() {
			return next;

		}

		public void setNext(IntNode next) {
			this.next = next;
		}
	}

	public void push(int value, int priority) {
		IntNode newNode = new IntNode(value, priority);
		IntNode current = head;
		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		if (newNode.priority > head.priority) {
			newNode.next = head;
			head = newNode;
			return;
		}
		if (newNode.priority < tail.priority) {
			tail.next = newNode;
			tail = newNode;
			return;
		}
		while (current.next != null) {
			if (newNode.priority > current.next.priority
					&& newNode.priority < current.priority) {
				newNode.next = current.next;
				current.next = newNode;
			} else {
				current = current.next;
			}
		}
	}

	public int pop() {
		if (head == null)
			throw new IllegalStateException("First node is null");
		int result = head.getValue();
		head = head.getNext();
		return result;

	}

	public int peek() {
		if (head == null)
			throw new IllegalStateException("First node is null");
		return head.getValue();
	}

	public int getSize() {
		if (head == null)
			throw new IllegalStateException();
		return getSize(head, 1);
	}

	private int getSize(IntNode current, int counter) {
		if (current == null)
			return counter;
		return getSize(current.next, counter + 1);

	}

}
