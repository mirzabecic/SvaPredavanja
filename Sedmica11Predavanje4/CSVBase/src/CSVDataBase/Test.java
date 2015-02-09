package CSVDataBase;

public class Test {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		racunanje(broj);
			
	}
	public static  int racunanje(int broj){
		 
		while(broj>1){
			System.out.println("e");
			racunanje(--broj);
		}
		return racunanje(broj);
	}

}
