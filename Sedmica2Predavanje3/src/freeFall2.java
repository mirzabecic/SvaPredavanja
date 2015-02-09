
public class freeFall2 {
	public static void main(String[] args) {
		double t = TextIO.getDouble();
		double h = TextIO.getDouble();
		double t1 = Math.sqrt(2*h)/9.81;
		System.out.println(t1);
		if (t1>t){
			double razlika = t1 - t;
		System.out.println("Nije dobro, potrebno je jos " + razlika);
		
		}
		else 
			System.out.println("Dobro ste predpostavili");
		
		
		
	}

}
