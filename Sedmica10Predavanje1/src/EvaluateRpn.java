
public class EvaluateRpn {
	public static void main(String[] args) {
		System.out.println("Unesite izraz u obrnutoj poljskoj notaciji (RPN):");
		while (TextIO.peek() != '\n'){
			if (TextIO.peek() == '+'){
				System.out.println("PLUS");
				TextIO.getChar();
			}else if (TextIO.peek() == '-'){
				System.out.println("MINUS");
				TextIO.getChar();
			}else{
				System.out.printf("Broj : %d\n", TextIO.getInt());
			}
			TextIO.skipBlanks();
		}
	}

}
