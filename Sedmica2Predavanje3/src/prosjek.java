import java.util.Scanner;


public class prosjek {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		double suma = 0;
		int n = 0;
		double unos1 = unos.nextDouble();
		while (unos1 != 0 ){
			suma = suma + unos1;
			n = n +1;
			 unos1 = unos.nextDouble();
		}
		if (n == 0){
			System.out.println("Morate unijeti barem jedan broj koji nije 0.");
		}else  {
			System.out.printf("Prosjek je: %f", suma/n);
		}
	}	
			
}
			
		
		
		
		
	


