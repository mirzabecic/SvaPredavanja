
public class treciZadatak {
	public static void main(String[] args) {
		double duzinaKockice = TextIO.getDouble();
		 double povrsinaKockice = duzinaKockice * duzinaKockice;
		 System.out.println(povrsinaKockice);
		 double visinaBazena = TextIO.getDouble();
		 double duzinaBazena = TextIO.getDouble();
		 double povStraneBazena = visinaBazena * visinaBazena * 2;
		 System.out.println(povStraneBazena);
		 double povStraneBazena2 =  visinaBazena * duzinaBazena *2;
		 System.out.println(povStraneBazena2);
		 double brojKockica=povStraneBazena + povStraneBazena2 + visinaBazena * duzinaBazena / povrsinaKockice;
		 System.out.println(brojKockica);
		 int i = 0;
				 
				
				 
	}

}
