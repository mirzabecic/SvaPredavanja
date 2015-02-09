
public class mine {
	public static void main(String[] args) {
		int  brojRedova=3;
		int brojKolona=5;
		char [][] igra=novaIgra(brojRedova,brojKolona);
		ispisiStanjeIgre(igra);
		char znak ='X';
		String pozicija="AO";
		odigrajPotez(igra,znak,pozicija);
	}



	private static char[][] novaIgra(int brojRedova, int brojKolona) {
		
		return new char [brojRedova][brojKolona];
	}
}