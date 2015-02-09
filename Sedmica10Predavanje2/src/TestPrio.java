
public class TestPrio {
	public static void main(String[] args) {
		PriorityQue prio = new PriorityQue();
		prio.push(10, 2);
		prio.push(12, 1);
		prio.push(14, 3);
		System.out.println(prio.peek());
		prio.pop();
		System.out.println(prio.peek());
		
	}

}
