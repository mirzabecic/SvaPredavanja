
public class arrayUtil {
	
		
		

	public static void printArray(int [] niz){
		/*prints out index
		 * 
		 */
		for (int i =0;i<niz.length;i++)
		System.out.print(niz[i] + " ");
		
		
	}
	/*numbers you want to printout
	 */
	
	public static int [] getUserArray(int size){
		int [] niz = new int [size];
		for (int i =0;i < niz.length;i++){
		niz[i]=TextIO.getInt();
		
		
		}
		return niz;
	}
	/*
	 * 
	 */
	public static int [] getArray(int size,int defaultVal){
		int [] niz= new int [size];
		for (int i =0;i<size;i++){
			niz[i]=defaultVal;
		}
		return niz;
			}
	public static void  copyArray(int []niz1, int []niz2){
		/**
		 * ukoliko je niz1 veci od niza2 treba da ispise da ne moze
		 */
		if (niz1.length>niz2.length){
			 System.out.println("Ne moze");
		 }else{
			
		
		for (int i = 0;i<niz1.length;i++){
		niz2[i]=niz1[i];
		}
		 }
	}
	/*
	/ja probavao zadatak, ne gledaj
	 * 
	 */
	//public static int [] unesiNiz(){
		//System.out.println("Koliko zelite clanova niza");
		//int velicinaNiza=TextIO.getInt();
		//int [] niz= new int [velicinaNiza];
	// for (int i =0;i < velicinaNiza;i++){
		// System.out.println("Unesi element ");
		// niz[i]= TextIO.getInt();
		 
		 
		 
	// }
	// return niz;
	//}
	public static int [] pomjeriUlijevo(int [] niz){
		
		int []niz1= new int [niz.length];
		
		for (int i = niz1.length-1;i>0;i--){
		   niz1[i]=niz[i-1];
		   
		}
		niz1[0]=0;
		return niz1;
	}
	public static int [] getColumn(int [][] matrix, int columnIndex){
		int [] niz1= new int [matrix.length];
		
		for (int i =0;i<niz1.length;i++){
			niz1[i]=matrix[i][columnIndex];
			
		}
		return niz1;
	}

}
