
public class prviZadatak {
	public static int najveciBroj(int [] brojevi){
		int max=brojevi[0];
		for  (int idx=1;idx<brojevi.length;idx++){
			int trenutni =brojevi[idx];
			if(trenutni > max){
				max=trenutni;
			}
			
		}
		return max;
		//int a=niz3[0];
		//int b=niz3[1];
		//int c=niz3[2];
		//if (a>b && a>c){
		//	return a;
			
		//}else if(b>c){
			//return b;
		//}
		//return c;
				}
	public static String nizUString(int[]niz){
		String strNiz = String.valueOf(niz[0]);
		for (int idx=1;idx<niz.length;idx++){
			
		
		strNiz = strNiz + ", " + niz[idx];
		}
		
		return strNiz;
	}
	
	public static void main(String[] args) {
		int [] rezultat=new int[]{1,7,3,7,3,9,13,2,24};
		ispisi (rezultat);
		System.out.println(najveciBroj(rezultat));
		
		
	}
     public static void ispisi (int[]niz){
	    for (int tmp : niz){
		   System.out.println(tmp);
	}
}

}
