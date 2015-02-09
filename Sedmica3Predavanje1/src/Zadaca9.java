
public class Zadaca9 {
	public static void main(String[] args) {
		String str= "Neka recenica koju provjeravamo,ali ovaj zarez da zeza.";
		int redniBrojKojiTrazimo=4;
		System.out.println("To je rijec; " +izvadiRijec(str, redniBrojKojiTrazimo));
	
	}

	private static String izvadiRijec(String recenica,
			int redniBrojRijeciKojiTrazimo) {
		String trazenaRijec = "";
		int trenutnaRijec = 0;
		int trenutniIndex = 0;
		while (trenutnaRijec < redniBrojRijeciKojiTrazimo) {
//			System.out.printf("Index: %d\tKarakter: %1s\tRed. br. rijeci: %d\n", trenutniIndex, recenica.charAt(trenutniIndex), trenutnaRijec);
			if (recenica.charAt(trenutniIndex) != ' ') {
				if (trenutniIndex == 0) {
					trenutnaRijec++;
				} else {
					if (recenica.charAt(trenutniIndex - 1) == ' ') {
						trenutnaRijec++;
					}
				}
			}
			trenutniIndex++;
		}
		trenutniIndex--;
		while (recenica.charAt(trenutniIndex) != ' ') {
			trazenaRijec += recenica.charAt(trenutniIndex);
			trenutniIndex++;
		}
		return trazenaRijec;
	}
}


