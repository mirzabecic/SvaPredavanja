
public class TestClass {

	
	public static void main(String[] args){
		//Ar rayListInt t = new ArrayListInt();
		//t.test();
		ArrayListInt newt = new ArrayListInt();
		newt.add(2);
		newt.add(4);
		newt.add(7);
		newt.addAt(55, 0);
		System.out.println(newt.toString());
		LinkedList <Integer> ml = new LinkedList<Integer>();
		ml.addAt(44, 1);
		System.out.println(ml.toString());

	}
}
