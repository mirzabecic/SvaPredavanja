
public class sabiranje {
	public static void main(String[] args) {
		if (args.length ==0){
			System.out.println("Greska: dodajte argumente koje program treba sabrati");
		}else{
			int suma=0;
			for (int i=0;i< args.length;i++){
				try{
					suma = suma + Integer.parseInt(args[i]);
				}catch (NumberFormatException e){
					System.out.printf("Upozorenje:Vrijednost %s nije ispravan broj.Preskacem.", args[i]);
				}
				
				System.out.println(args[i]);
			}
			System.out.printf("Suma argumenata je : %d\n", suma);
		}
	}
	

}
