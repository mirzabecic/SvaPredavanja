public class Vjezba {
	public static void main(String[] args) {
		System.out.println("Unesite neki broj da vidimo hocetee li pogoditi");
		int randomNumber = (int) (Math.random() * 1000000);
		
		int a = 0;
		while (randomNumber != a) {
			a = TextIO.getInt();
			if (randomNumber == a) {
				System.out.println("Pogodili ste");

			} else if (randomNumber < a) {
				System.out.println("Broj je manji od tog broja");

			} else {
				System.out.println("Broj je veci od tog broja");
			}
		}

	}

}
