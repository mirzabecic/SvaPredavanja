
public class StackOfInt {
	IntNode head;
	public void push(int n){
		IntNode nextNode = new IntNode(n);
		nextNode.setNext(head);
		head = nextNode;
		
	}
	public int pop(){
		if ();
		return 0;
		
	}
	private static class IntNode{
		int value;
		IntNode next;
		
		public IntNode(int value){
			this.value = value;
		}
		public void setNext(IntNode head) {
			// TODO Auto-generated method stub
			
		}
		public int getValue(){
			return value;
		}
		public IntNode getNext(){
			return next;
			
		}
	}

}
