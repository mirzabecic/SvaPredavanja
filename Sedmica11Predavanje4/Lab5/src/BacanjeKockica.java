import java.util.Scanner;

public class BacanjeKockica {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double broj1 = unos.nextInt();
		double broj2 = unos.nextInt();
		
		
		System.out.println(broj1);
		System.out.println(broj2);
		int kockica1 = (int) broj1;
		System.out.println(kockica1);
		int kockica2 = (int) broj2;
		System.out.println(kockica2);
		int rezultat = kockica1 + kockica2;
		System.out.println(rezultat);

	}

}
