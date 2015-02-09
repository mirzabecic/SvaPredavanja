
public class pozivanje {
	public static void main(String[] args) {
		TextIO.readUserSelectedFile()	;
		int sum =0;
		while (TextIO.eof()!=true){
			
			try{
				String word =TextIO.getWord();
				int broj =Integer.parseInt(word);
				sum+=broj;
			}catch(NumberFormatException e){
				TextIO.putln("Razmak");
			}catch (IllegalArgumentException ia){
				TextIO.putln("Moramo skontati kako getWord radi");
				break;
			
			}
		}
		TextIO.putln("Suma:" + sum);
	}

}
