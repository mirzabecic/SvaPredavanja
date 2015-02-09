public class Rekurzija {
	public static void main(String[] args) {
		int number = TextIO.getInt();
		int newNumber = TextIO.getInt();
		 System.out.println(rekurzija(number, newNumber));
		System.out.println(sum(number));

	}

	public static int rekurzija(int number, int newNumber) {
		if (newNumber == 0)
			return 1;

		return number * rekurzija(number, newNumber - 1);
	}

	public static int sum(int number) {
		if (number > 0)
			return number + sum(number - 1);
		return 0;
	}
}
