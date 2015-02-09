import java.util.Scanner;


public class maloKomplikovanije {
	public static void main(String[] args) {
	 System.out.println("Upisite broj");
	 int velicina = TextIO.getInt();
     int [] niz=unosNiza(velicina);
     int sum =0;
     for(int i = 0; i<niz.length;i++)
    	 System.out.println("Suma elemenata:" + sum);
		   System.out.println("unijeli ste:");
		   for  (int i=0; i<velicina; i++){
			   System.out.print(niz[i]);
		   }
	}
    public static int [] unosNiza(int bure) {
    	
    	int [] niz = new int [bure];
	   for  ( int i=0; i<bure; i++){
		   Scanner input= new Scanner(System.in);
		   niz [i] = input.nextInt();
		   
	   }
	   return niz;
    }
    
    
}
