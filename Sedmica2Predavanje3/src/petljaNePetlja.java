import java.util.Scanner;


public class petljaNePetlja {
	public static void main(String[] args) {
		Scanner  unos = new Scanner(System.in);
		System.out.println("unesi ime a zatim i prezime");
		String ime = unos.next ();
		String prezime = unos.next();
		System.out.println(" Ime " + ime + " prezime " + prezime);
		
	 int i = unos.nextInt();
	 while (i<10){
		 System.out.println("Ja se mrzim ponavljati");
		i++;
		 
		 
		
	 }
	}

}
