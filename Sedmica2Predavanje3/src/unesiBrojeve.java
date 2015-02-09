import java.util.Scanner;


public class unesiBrojeve {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("unesite dva broja");
		
		
				 do	{
					 int prviBroj=unos.nextInt();
					 int drugiBroj=unos.nextInt();
			 
			 int rezultat = prviBroj + drugiBroj;
			
			
			System.out.println(rezultat);
			System.out.println("unesite druga dva broja");

		 } while(prviBroj !=0 && drugiBroj != 0);
		
		
	
			
			
		
		
	}

}
