
public class LinkedListIntTest {
public static void main(String[] args) {
	LinkedListInt first = new LinkedListInt();
	first.add(1); 
	first.add(2);
	first.add(3);
	first.add(4);
	first.printList();
	first.removeAt(0);
	System.out.println("poslije brisanja");
	first.printList();
	int [] array = first.toArray();
	for (int i : array){
		System.out.println(i);
	}
	}
}
