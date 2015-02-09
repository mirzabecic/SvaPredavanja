import java.util.Scanner;


public class LudaPovrsina {
	public static void main(String[] args) {
		Scanner unos= new Scanner(System.in);
		double duzina =unos.nextDouble();
		
		double povrsinaKvadrata = duzina * duzina;
		System.out.println("povrsinaKvadrata");
		System.out.println(povrsinaKvadrata);
		double obimKvadrata=4*duzina;
		System.out.println("obimKvadrata");
		System.out.println(obimKvadrata);
		double povrsinaKruga=duzina*duzina*Math.PI;
		System.out.println("povrsinaKruga");
		System.out.println(povrsinaKruga);
		double obimKruga=2*duzina*Math.PI;
		System.out.println("obimKruga");
		System.out.println(obimKruga);
		int razlika=(int) povrsinaKvadrata; 
		System.out.println("razlika");
		System.out.println(razlika);
		int razlika2=(int) povrsinaKruga;
		System.out.println("razlika2");
		System.out.println(razlika2);
		int rezultat= razlika2 / razlika;
		System.out.println("rezultat");
		System.out.println(rezultat);
		double zapreminaValjka=povrsinaKruga * 0.5 + (Math.random())*(36.7 - 0.5 + 1);
		System.out.println("zapreminaValjka");
		System.out.println(zapreminaValjka);
		
		
		
		
		
		
				

		
	}
	
		
			}

