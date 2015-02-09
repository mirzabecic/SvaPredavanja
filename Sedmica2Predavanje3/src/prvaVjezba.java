import java.util.Scanner;

public class prvaVjezba {
	public static void main(String[] args) {
		System.out.println(" Unesi 2 broja");
		Scanner unos = new Scanner(System.in);
		int a = unos.nextInt();
		int b = unos.nextInt();
		if (a > b) {
			System.out.println("a je veci broj");
		} else {
			System.out.println("b je veci broj");
		}

	}

}
