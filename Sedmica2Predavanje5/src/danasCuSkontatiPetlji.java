
public class danasCuSkontatiPetlji {
	public static void main(String[] args) {
		System.out.println("unesi dva broja");
		int pocetniBroj=TextIO.getInt();
		int krajnjiBroj=TextIO.getInt();
		int rezultat = 0;
		int rezultat2 =0;
	
		while (pocetniBroj<=krajnjiBroj){
			if (pocetniBroj%2==0){
				
			rezultat=rezultat+pocetniBroj;
			}
			if (pocetniBroj%2==1){
				rezultat2=rezultat2+pocetniBroj;
			}			
								
			pocetniBroj++;
		
		 }
		System.out.println("zbir svih parnih brojeva je " + rezultat);
		System.out.println("zbir svih neparnih brojeva je" + rezultat2);
//		int pocetniBroj=1;
		//		int zadnjiBroj=100;
//		for (pocetniBroj=1;pocetniBroj<=zadnjiBroj;pocetniBroj++)
//		{
//			
//			if (pocetniBroj%2==0)
//		
//			System.out.println(pocetniBroj);
//		}
	}

}
