
public class minee {
	public static void main(String[] args) {
		napPolje();
	}
	public static int[][] matrica (int brojRedova,int brojKolona){
		int [][] polje= new int [brojRedova][brojKolona];
		return polje;
			
		
		
	}
	public static void ispisPolja(int [][]poljana){
		for (int i=0;i<poljana.length;i++){
			System.out.print("|");
			for (int j=0;j<poljana.length;j++){
				System.out.printf("%2d |", poljana[i] [j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	// random mjesta gdje ce biti mina
	public static int  randomBroj(int pocetakIntervala,int krajIntervala){
		
		int rBroj=(int )(Math.random() * krajIntervala-pocetakIntervala );
		return rBroj;
	}
	public static int [][]mine(int [][] table){
		int numberOfMines = (int)(0.3*table.length*table.length);
		int brojac=1;
		while (brojac<=numberOfMines){
			int x=randomBroj(0,table.length);
			int y=randomBroj(0,table.length);
			if (table[x][y]!= -1){
				table[x][y]=-1;
						brojac ++;
						
						
			}
		}
		return table;
	}
	public static void napPolje(){
	int brojRedova=5;
	int brojKolona=5;
	int [][] polje= matrica(brojRedova, brojKolona);
	/*ispisPolja(polje);*/
	int pocetakIntervala=TextIO.getInt();
	int krajIntervala=TextIO.getInt();
	System.out.println(randomBroj(pocetakIntervala,krajIntervala));
	polje=mine(polje);
	ispisPolja(polje);
	}
	}
	


