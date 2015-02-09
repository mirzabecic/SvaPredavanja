import java.util.Scanner;


public class mica {
	public static void main(String[] args) {
		igrajIgricu('x', 'o',' ');
	}

	private static void igrajIgricu(char prviIgrac, char drugiIgrac, char nijedanIgrac) {
		int aktivniIgrac = 0;// - igrac x;1 - igrac O;
		String izabranoPolje=null;
		char[][] poljanaZaIgru = new char[3][3] ;
		boolean krajIgre =false;
		for (int i =0;i<3;i++){
			for(int j=0;j<3;j++){
				poljanaZaIgru[i][j] = nijedanIgrac;
			}
		}
		
		do {
			do{
				 izabranoPolje=unesiPolje(aktivniIgrac);	
			}while(izabranoPoljeJeIspravno(izabranoPolje, poljanaZaIgru,nijedanIgrac));
		 	postaviPolje((aktivniIgrac==0 ? prviIgrac : drugiIgrac),izabranoPolje,poljanaZaIgru);
		 	krajIgre=krajIgre(poljanaZaIgru);
		 	if (!krajIgre){
		 		aktivniIgrac = promijeniAktivnogIgraca(aktivniIgrac);
		 	}
		}while (krajIgre);
		if (nemaPobjednika(poljanaZaIgru)){
			ispisRemi();
		}else{
			ispisiPobjednika(aktivniIgrac);
		}
		
	}

	private static void ispisiPobjednika(int aktivniIgrac) {
		// TODO Auto-generated method stub
		
	}

	private static void ispisRemi() {
		// TODO Auto-generated method stub
		
	}

	private static boolean nemaPobjednika(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static int promijeniAktivnogIgraca(int aktivniIgrac) {
		// TODO Auto-generated method stub
		if (aktivniIgrac==0)
			return 1;
		return 0;
	}

	private static boolean krajIgre(char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		return false;
	}

	private static void postaviPolje(int aktivniIgrac, String izabranoPolje,
			char[][] poljanaZaIgru) {
		// TODO Auto-generated method stub
		
	}

	private static boolean izabranoPoljeJeIspravno(String izabranoPolje,char[][] poljanaZaIgru, char nijedanIgrac) {
		/*
		 * 
		 */
		try{
			int polje = Integer.parseInt(izabranoPolje);
			if ((polje <10) && (polje >0)){
				if (poljanaZaIgru[(polje - 1)/3][(polje - 1)%3]== nijedanIgrac){
				return true;
				}
			}
		}catch (Exception e) {
			}
		return false;
	}

	private static String unesiPolje(int aktivniIgrac) {
		Scanner in=new Scanner(System.in);
		System.out.println("Unesi polje koje zelis odigrati:\n+---+---+--+\n| 7 | 8 | 9 |\n|4 | 5 | 6 |\n | 1 | 2 | 3 |\n+---+---+---+");
		return in.nextLine();
	}

}
