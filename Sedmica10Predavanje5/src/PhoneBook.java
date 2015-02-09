import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import com.sun.org.apache.xml.internal.dtm.ref.ExpandedNameTable;

public class PhoneBook {
	static Map<String, LinkedList<Integer>> map = new HashMap<String, LinkedList<Integer>>();

	public static void main(String[] args) {

		int option = 0;
		do {
			System.out.println("Upisite:");
			System.out.println("1 za unos novog korisnika");
			System.out.println("2 za ispis korisnika i broja telefona");
			System.out.println("3 za dodavanje broja postojecem korisniku");
			System.out.println("4 za brisanje broja postojecem korisniku");
			System.out.println("5 za izlaz");
			option = TextIO.getlnInt();

			if (option == 1) {
				System.out.println("Upisite ime novog korisnika");
				String name = TextIO.getlnString();
				System.out.println("Upisite broj korisnika");
				int number = TextIO.getlnInt();
				map.put(name, new LinkedList<Integer>());
				map.get(name).push(number);
			}
			if (option == 2) {
				java.util.Set<String> keys = map.keySet();
				Iterator<String> keyIterator = keys.iterator();
				if (map.isEmpty()) {
					System.out.println("Imenik je prazan!");
				}
				while (keyIterator.hasNext()) {
					String key = keyIterator.next();
					Iterator<Integer> valueIterator = map.get(key).iterator();
					System.out.println("Ime: " + key);
					while (valueIterator.hasNext()) {
						System.out.println("Broj: " + valueIterator.next());
					}
					System.out.println();
				}

			}
			if (option == 3) {
				System.out.println("unesite ime postojeceg korisnika");
				String exName = TextIO.getlnString();
				while (!map.containsKey(exName)) {
					System.out.println("Korisnik ne postoji u imeniku");
					exName = TextIO.getlnString();
				}
				System.out.println("Unesite dodatni broj");
				int newNumber = TextIO.getlnInt();
				map.get(exName).add(newNumber);
				
				
			}
			if( option == 4){
				System.out.println("unesite ime postojeceg korisnika");
				String exName = TextIO.getlnString();
				while (!map.containsKey(exName)){
					System.out.println("Korisnik ne postoji u imeniku");
					exName = TextIO.getlnString();
				}
				System.out.println("unesite postojeci broj");
				int exNumber = TextIO.getlnInt();
				while (!map.containsKey(exNumber)){
					System.out.println("Broj korisnika ne postoji");
					exNumber = TextIO.getlnInt();
				}
				map.get(exName).remove(exNumber);
			}

		}while(option != 5);

	}
}
