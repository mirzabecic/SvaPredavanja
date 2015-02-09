
public class karte {
	public static void main(String[] args) {
		int [] spil = noviSpil();
		System.out.println("Novi spil:" + nizUString(spil));
		 
		int brojPromjena = 100;
		for (int i=0 ;i<brojPromjena;i++){
			zamijeniDvijeKarte(spil);
		}
 System.out.println("Promjesan spil; " + nizUString(spil));
	}
	public static void zamijeniDvijeKarte(int []spil){
		int prva = randomKarta();
		int druga = randomKarta();
		zamijeni(spil, prva, druga);
	}
    public static int[] noviSpil(){
    	int [] karte = new int [52];
    	for (int i =0; i<karte.length; i++){
    		karte[i]= i+1;
    	}
    	return karte;
    }
    public static int randomKarta(){
    	return (int)(Math.random()*52);
    }
public static void zamijeni (int []niz, int i1,int i2){
		
		int privremeno=niz[i1];
		niz[i1]=niz[i2];
		niz [i2]=privremeno;
	}
public static String nizUString(int[]niz){
	String strNiz = String.valueOf(niz[0]);
	for (int idx=1;idx<niz.length;idx++){
	
	
	strNiz = strNiz + ", " + niz[idx];
	}
}

