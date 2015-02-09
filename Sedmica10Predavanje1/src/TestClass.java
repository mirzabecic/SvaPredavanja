
public class TestClass {
	public static void main(String[] args) {
		StackInt s = new StackInt();
		s.push(5);
		s.push(2);
		s.push(55);
		s.push(5);
		s.push(2);
		s.push(55);
		
		System.out.println(s.contains(5));
	}
}
