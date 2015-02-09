import java.util.Scanner;


public class oduzimanje {
	public static void main(String[] args) {
		Scanner unos=new Scanner (System.in);
		int umanjenik=unos.nextInt();
		int umanjilac=unos.nextInt();
		int rezultat=umanjenik - umanjilac;
		
		if (rezultat < 0 ){
			rezultat = rezultat * -1;	
		}
		
		System.out.println (rezultat);
	}

}
