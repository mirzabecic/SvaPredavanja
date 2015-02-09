
public class Zadaca3 {
	public static void main(String[] args) {
		System.out.println("Unesite Koeficijente a,b i c");
		int a = TextIO.getInt();
		int b = TextIO.getInt();
		int c = TextIO.getInt();
		System.out.println("Unesite tacku x");
		int x = TextIO.getInt();
		int rezultat;
		if ((a<-10 || a>10) || (b<-10 || b>10) || (c <-10 || c>10)){
			System.out.println("Koeficijenti a,b i c nisu u zadanom intervalu ");
		}
		rezultat = a*x*x+b*x+c;
		System.out.println("f"+ "(" + x + ")"+ "=" + rezultat);
	}

}
