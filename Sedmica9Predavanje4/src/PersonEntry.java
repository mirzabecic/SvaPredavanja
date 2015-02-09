import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class PersonEntry {
	public static void main(String[] args) {

		String name;
		PersonNode firstPerson = null;

		int counter = 0;

		do {
			name = TextIO.getlnString();
			Person person = new Person(name);
			PersonNode pNode = new PersonNode(person);

			if (firstPerson == null) {
				firstPerson = pNode;

			} else {
				add(person, firstPerson);
			}
		} while (!name.equals("kraj"));

		for (PersonNode current = firstPerson; current.getNext() != null; current = current
				.getNext()) {
			counter++;
			System.out.println(current.toString());
		}
		System.out.println(counter);			

	}

	private static void add(Person person, PersonNode firstPerson) {
		PersonNode lastPerson = firstPerson;
		while (lastPerson.getNext() != null) {
			lastPerson = lastPerson.getNext();

		}

		lastPerson.setNext(new PersonNode(person));

	}
	public static int count(PersonNode head){
		int count = 0;
		for (PersonNode current = head; current != null;current = current.getNext()){
			count++;
		}
		return count;
	}

}
