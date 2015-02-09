
public class pravoDugiZadatak {
	public static void main(String[] args) {
		int visina,sirina;
		System.out.println("Unesi visinu: ");
		visina = TextIO.getlnInt();
		System.out.println("Unesi sirinu: ");
		sirina = TextIO.getlnInt();
		
		int[][] matrica = kreirajMatricu(visina,sirina);
		ispisiMatricu(matrica);
		ispis1DNiza(matrica[0]);
		
		 matrica = postaviVrijednost(matrica);
		 ispisiMatricu(matrica);
		 for (int i =0;i<matrica.length;i++){
			 int suma = sumaReda (matrica[i]);
			 System.out.println(suma);
		 }
	}
	public static int  sumaReda(int [] is){
		int suma = 0;
		for (int broj : is){
			suma +=broj;
			
		}
		return suma;
	}
	public static int zbirNaDiagonali(int [][] matrica){
		int sum =0;
		int j = matrica.length -1;
		for (int i=0;i<matrica.length;i++){
			sum+=matrica [i][j - i];
		}
		return sum;
	}
	public static int [][]kreirajMatricu(int visina,int sirina){
		int [][] matrica = new int [visina][sirina];
		
		return matrica;
				
		
	}
	public static void ispisiMatricu (int[][] matrica){
		for (int i = 0; i< matrica.length;i++){
			for (int j =0;j<matrica[i].length; j++){
				System.out.print(matrica [i][j] + " ");
			}
			System.out.println(); 
		}
		
	}
     public static void ispis1DNiza(int []niz){
    	 
    	 for (int i =0;i<niz.length;i++){
    		 System.out.print(niz[i] + " ");
    	 }
     }
    	 public static int [][] postaviVrijednost(int [][] matrica){
    		 int i=0;
    		 int j=0;
    		 int broj= TextIO.getInt();
    		 do{
    		 i=TextIO.getInt();
    		 j= TextIO.getInt();
    		 
    		
    		 while (i <0 || i>=matrica.length){
    			 System.out.println("Upisi  veci broj od 0 i manji od duzine");
    			 i=TextIO.getInt();
    		 }
    		 while (j<0 || j>=matrica[i].length){
    			 System.out.println("Isto i ovdje");
    			 j=TextIO.getInt();
    		 }
    		 
    		
    		
    	 }while (matrica[i][j]!=0);
    		 matrica[i][j]=broj;
    		 return matrica;
    		 
    		 public static boolean sviIstiURedu(int [] is){
    			 boolean SviSuIsti=true;
    		    	int suma = 0;
    				for (int broj : is){
    					suma +=broj;
    			 
    		 }
}
}