
public class maloLaksiZadatak {
	public static void main(String[] args) {
		System.out.println("Ispisi do kojeg broja zelite da ide");
		int broj = TextIO.getInt();
		int brojac1= 0,brojac2=0;
		
		for ( int i = 1; i <= broj;i++){
			if ( i %3==0)
				brojac1++;
		if (i % 5 == 0)
			brojac2++;
			
			
		}
			System.out.println(brojac1 + " je djeljivo sa 3 "+ brojac2 + "je djeljivo sa 5");
			brojac1=0;
					brojac2=0;
					int i=1;
					
					while (i <=broj){
				if (i%3==0);
					brojac1++;
					if (i%5==0);
					brojac2++;
					
					}
					System.out.println(brojac1 + " je djeljivo sa 3 "+ brojac2 + "je djeljivo sa 5");
			
	}

}
