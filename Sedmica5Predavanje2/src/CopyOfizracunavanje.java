
public class CopyOfizracunavanje {
	public static void main(String[] args) {
		
		
		double [] niz = unos();
		
		Student[] s=
		System.out.println("Cijena je " + cijena(niz));
	}
		
			/**
			 * izracunavanje tezine
			 * @param visina
			 * @param sirina
			 * @param duzina
			 * @return
			 */
		
	
     public static double racunanje ( double visina, double sirina, double duzina){
    	 double rezultatTezina;
    	 rezultatTezina = visina*sirina*duzina/5000;
 		System.out.println(rezultatTezina + " kg ");
 		return rezultatTezina;
    	 
     }
       
     public static double cijena(double [] niz){
    	 double  rezultatTezina=racunanje( niz[1], niz[2], niz[3]);
    	 if (rezultatTezina>niz[0]){
    		
    		return rezultatTezina;
    	}else {
    		return niz [0];
    	 
        }
    	 
     }
     public static double [] unos (){
    	 double [] niz= new double  [4];
    	 System.out.println("Unesite kilazu");
 		double stvarnaKilaza=TextIO.getDouble();
 		System.out.println("Unesi visinu");
 		 double visina = TextIO.getDouble();
 		System.out.println("Unesite sirinu");
 		 double sirina=TextIO.getDouble();
 		System.out.println("Unesite duzinu");
 		 double duzina= TextIO.getDouble();
 		 niz[0]= stvarnaKilaza;
 		 niz[1]=visina;
 		 niz[2]=sirina;
 		 niz[3]=duzina;
     
     return niz;
     
     }
    
     
}

    			
    				
