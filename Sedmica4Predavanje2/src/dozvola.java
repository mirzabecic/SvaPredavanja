
public class dozvola {
	public static void main(String[] args) {
		TextIO.readUserSelectedFile();
		String word= TextIO.getWord();
		String number=TextIO.getWord();
		int broj=Integer.parseInt(number);
		System.out.println(word);
		System.out.println(broj);
		if (broj<18){
			System.out.println("Ne mozes nastaviti sa programom");
		}else{
			System.out.println("Nastavi dalje");
		}
			
		
		
	}
	

}
