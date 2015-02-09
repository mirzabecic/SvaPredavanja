import javax.xml.soap.Node;


public class BinarySearch {
	private Node root;
	
	public BinarySearch(){
		root = null;
	}
	public void add(int value){
		if(root == null)
			root =new Node(value);
		else
			add(root, value);
	}
	private void add (Node current, int value){
		if(current == null){
			current =new Node(value);
			return;
		}
		if(value <= current.value){
			if (current.left == null){
				current.left = new Node(value);
				return;
			}
			add(current.left, value);
			
		}else{
			add(current.right, value);
		
		
	}
	private static class Node{
		
	}
		int value;
		
		
	}
	public print ( root){
		if(root == null){
			System.out.println(root.value);
		}else{
			print(root.left.value);
			print(root.right.value);
		}
		public contain
		
	}


