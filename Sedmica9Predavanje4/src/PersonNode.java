
public class PersonNode {
	private PersonNode next;
	private Person person;
	public PersonNode(Person person) {
		this.person = person;
	}
	
	
	@Override
	public String toString() {
		return "PersonNode [person=" + person + "]";
	}


	public PersonNode getNext() {
		return next;
	}
	public void setNext(PersonNode next) {
		this.next = next;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
}
