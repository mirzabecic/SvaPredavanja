package mojeVjezbanje;


public class zadaca1 {
	public static void dijeljiviBrojevi (int unos, int djelilac){
		System.out.printf("Brojevi dijeljivi sa %d \n",djelilac);
		
		for (int i =1; i<=unos;i++){
			if (i%djelilac==0){
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("Unesi broj : ");
		int broj=TextIO.getInt();
		
		dijeljiviBrojevi(broj,11);
		dijeljiviBrojevi(broj,7);
		dijeljiviBrojevi(broj,5);
		
		
	}
	

}
