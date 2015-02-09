
public class gluposti {
	public static void main(String[] args) {
		
		ispisi();
			
	
		
	}
	public static void ispisi(){
		System.out.println("upisi velicinu niza");
		int velicina = TextIO.getInt();
		int [] niz = new int [velicina];
		for (int i =0;i<velicina;i++){
			System.out.println("upisi clanove");
			niz[i]=TextIO.getInt();
		}
		for (int i= 0;i <niz.length;i++){
			System.out.println(niz[i]);
		}
		
	}
	

}
