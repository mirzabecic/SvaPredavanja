import java.util.Scanner;


public class jaja {
	public static void main(String[] args) {
		Scanner unos = new Scanner( System.in);
		System.out.println("Ubaci jaja");
				int jaje=unos.nextInt();
				int rezultat2= jaje /12;
		        int rezultat3= jaje%12;
		        int gross=jaje/144;
		        if (jaje<144)
		        	gross=0;
		        System.out.println(gross);
				System.out.println(rezultat2);
		System.out.println(rezultat3);
		
	}

}
