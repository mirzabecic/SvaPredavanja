
public class Rekurzija {
	public static void main(String[] args) {
		
		int noviBroj=TextIO.getInt();
		ponavljanje(noviBroj);
	}
	public static void ponavljanje(int noviBroj){
		if (noviBroj==0){
			return;
		}
		System.out.print("e");
         ponavljanje(noviBroj-1);
         
         
	}

}
