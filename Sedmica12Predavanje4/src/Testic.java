import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

import org.omg.CORBA.Any;
import org.omg.CORBA.Object;
import org.omg.CORBA.TypeCode;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class Testic {

	public static void main(String[] args) {

		Person person1 = new Person("Mirza", "Becic",21);
		Person person2 = new Person("Tombe", "Talic",22);
		Person person3 = new Person("Davor", "Stankovic",23);
		Person person4 = new Person("Jesenko", "Gavric",24);
		Person person5 = new Person("Nedzad", "Hamzic",25);

		person1.addChild(new Person("Child", "1",21));
		person2.addChild(new Person("Child", "1",22));
		person3.addChild(new Person("Child", "1",23));
		person4.addChild(new Person("Child", "1",24));
		person5.addChild(new Person("Child", "1",25));
		
		LinkedList<Person> persons = new LinkedList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);
		persons.add(person5);
		
		//LinkedList<Person> children = new LinkedList<Person>();
		
		try {
			
			Person.personToXML(persons, new FileOutputStream("./XML/person2.xml"));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}