
public class prostiBrojevi {
	public static void main(String[] args) {
		
		if (args.length!=0){
			daLiJeProsti(Integer.parseInt(args[0]));
			if (daLiJeProsti(Integer.parseInt(args[0]))==true){
				System.out.println("Broj je prost");
			}else{
				System.out.println("Nije prost");
			
			}
		
		}
		
		int broj=0;
		do {
		System.out.println("Upisi broj");
		broj=TextIO.getInt();
		if (daLiJeProsti(broj)==true){
			System.out.println("Broj je prost");
		}else{
			System.out.println("Nije prost");
		}
		}while(broj!=0);
					
		
			
	}
	public static boolean daLiJeProsti(int broj){
		
		boolean tacno= true;
		
		 for (int i = 2; i <broj;i++){
			 if (broj%i==0){
				 return false;
}
		 }
		 return tacno;
		  
	
	
				
	}
	
}
