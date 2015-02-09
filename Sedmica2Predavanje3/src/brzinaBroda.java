
public class brzinaBroda {
	public static void main(String[] args) {
		int brzinaBroda = TextIO.getInt();
		double distanca = TextIO.getDouble();
		double brzinaBrodaKilometri = brzinaBroda * 1.61;
				double t;
		t = distanca / brzinaBrodaKilometri	;
		System.out.println("vrijeme je " + t);
	}

}
