
public class josNovijiZadatak {
	public static void main(String[] args) {
		int broj = TextIO.getInt();
		int brojac1 = 0;
		int brojac2 =0;
		int i =1;
		do {
			if (i%3==0)
			brojac1++;
			if (i%5==0)
			brojac2++;
			i++;
		}
			while (i <= broj);
		System.out.println(brojac1);
		System.out.println(brojac2);
			
	}

}
