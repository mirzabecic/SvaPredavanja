
public class Zadaca2 {
	public static void main(String[] args) {
		System.out.println("Upisite 3 broja od 50 do 200");
		int prviBroj= TextIO.getInt();
		int drugiBroj=TextIO.getInt();
		int treciBroj=TextIO.getInt();
		
		if ((prviBroj <50 && prviBroj >200) || (drugiBroj <50 && drugiBroj>200) || (treciBroj < 50 || treciBroj>200)){
			System.out.println("Prekid programa");
		}
		if (prviBroj>drugiBroj){
			int temp;
			temp=prviBroj;
			prviBroj=drugiBroj;
			drugiBroj=temp;
			
		}
		if (prviBroj>drugiBroj){
			int temp;
			temp=drugiBroj;
			drugiBroj=treciBroj;
			treciBroj=temp;
		}
		if (drugiBroj>treciBroj){
			int temp;
			temp= drugiBroj;
			drugiBroj=treciBroj;
			treciBroj=temp;
		}
		System.out.printf("%d,%d,%d", prviBroj,drugiBroj,treciBroj);
	}

}
