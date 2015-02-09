import java.util.Scanner;


public class nizoviPrviZadatak {
	public static void main(String[] args) {
		System.out.println("Koliko clanova zelite");
		int max=TextIO.getInt();
	    int [] niz = new int [max];
	    
	   for  ( int i=0; i<max; i++){
		   Scanner input= new Scanner(System.in);
		   niz [i] = input.nextInt();
	   }
	   System.out.println("unijeli ste:");
	   for  (int i=0; i<max; i++){
		   System.out.print(niz[i] + " ");
	   }
	}
	

}
