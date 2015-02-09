
public class IWillTryICantGiveUp {
	public static void main(String[] args) {
		System.out.println("koliko imate godina?");
		int year = TextIO.getInt();
		if(year<0 || year > 100){
			System.out.println("FUCK YOU LIER!");
			
		}else{
			System.out.println("Imate " + year + " godina!");
		}
		
	}

}
