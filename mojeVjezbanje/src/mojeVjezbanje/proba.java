package mojeVjezbanje;

public class proba {
	public static boolean provjera (String korisnik){
		boolean imaSlovo=false;
				int poz=1;
		for (int i=0;i <=korisnik.length() - 1;i++){
			for (int j=poz;j<=korisnik.length() -1 ;j++){
				 if (korisnik.charAt(i)==korisnik.charAt(j)){
					 imaSlovo=true;
				 }
			}
			poz++;
		}
		return imaSlovo;
	}		
	public static void main(String[] args) {
		String ime = TextIO.getln();
		if (provjera(ime)==true)
			System.out.println("Ima ista slova");
		else System.out.println("nema");

	}
	}


