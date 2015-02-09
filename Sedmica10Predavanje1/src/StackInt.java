


public class StackInt {
	private IntNode head;
	
		public void push(int value){
			IntNode p = new IntNode(value);
			p.setNext(head);
			head = p;
		}
		
		public int pop(){
			if(head == null)
				throw new IllegalStateException("First node is null");
			int result = head.getValue();
			head = head.getNext();
			return result;
		}
	
		/**
		 * Method return value of first element in stack.
		 * @return
		 */
		public int peek(){
			if(head == null)
				throw new IllegalStateException("First node is null");
						
			return head.getValue();
		}
		
		/**
		 * Method to get size.
		 * @return size of our stack
		 */
		public int getSize(){
			if(head == null)
				return 0;			
			return getSize(head, 1);
			
		}
		/**
		 * Recursive way to get size of stack. Current will start as our head and keep going on, while we'll be increasing counter.
		 * Once our current is null, we'll return our counter.
		 * @param current
		 * @param counter
		 * @return
		 */
		private int getSize(IntNode current, int counter){
			if(current.getNext() == null)
				return counter;
			return getSize(current.next	, counter + 1);
						
		}
		
		public boolean contains(int value){
			return contains(value, head);
		}
		
		private boolean contains(int value, IntNode current){
				if(current == null)
					return false;
			
				if(current.getValue() == value)
					return true;
			
				if(current.getValue() != value)
					return contains(value, current.getNext());
			
							
				return false;
		}
	
	
	
	private static  class IntNode{
		private int value;
		private IntNode next;
		
		public IntNode(int value){
			this.value = value;
		}
		
		public int getValue(){
			return value;
		}
		public IntNode getNext(){
			return next;
		}
		public void setNext(IntNode next){
			this.next = next;
		}
		
	}
	
}
