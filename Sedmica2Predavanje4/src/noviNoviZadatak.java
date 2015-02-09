
public class noviNoviZadatak {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int brojac1=0;
		int brojac2=0;
		int i=1;
		
		while (i <=broj){
	
		if (i%3==0)
		brojac1++;
		if (i%5==0)
		brojac2++;
		i++;
		
		}
		System.out.println(brojac1 + " je djeljivo sa 3 "+ brojac2 + "je djeljivo sa 5");

	}

}

