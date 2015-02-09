


public class zadaca1 {
	public static boolean jeDijeljiv(){
		
	}
	public static void main(String[] args) {
		int unijetiBroj=TextIO.getInt();
		for (int i =1;i<=unijetiBroj;i++){
			if(i%5==0){
				System.out.println("Brojevi dijeljivi sa 5 su : " + i);
			}
			else if (i%7==0) {
				System.out.println("Brojevi dijeljivi sa 7 su : " + i);
			}
			else if (i%11==0){
				System.out.println("Brojevi dijeljivi sa 11 su ; " + i);
			}
		}
		
	}
}
	
	
	