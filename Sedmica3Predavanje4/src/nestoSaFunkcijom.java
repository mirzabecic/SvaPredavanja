
public class nestoSaFunkcijom {
	public static void main(String[] args) {
		System.out.println("Unesite broj; ");
		int broj= TextIO.getInt();
		int [] brojevi=new int [broj];
		System.out.println(prosjekOcjena(brojevi));
		
		
	}
	public static double prosjekOcjena(int [] brojevi){
		int sum=0;
		for (int i =0;i< brojevi.length;i++){
			sum =+ brojevi[i] ;
		}
		
		double  average = (double)sum / (double)brojevi.length;
		return average;
	}

}
