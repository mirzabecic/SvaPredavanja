
public class prviZadatak {
	
	public static int sabiranje(int a, int b){
		int sabiranje= a + b;
				return sabiranje;
							
	}
	/**
	 * oduzimanje dva integera
	 * @param a integer bilo koji	
	 * @param b integer moze biti bilo koji
	 * @return razlika
	 */
	public static int oduzimanje(int a, int b){
		int oduzimanje= a - b;
				return oduzimanje;
			
	}
	public static int mnozenje(int a, int b){
		int mnozenje= a * b;
				return mnozenje;
			
	}
	public static int dijeljenje(int a, int b){
		int dijeljenje= a / b;
				return dijeljenje;
			
	}
	public static double sabiranje ( double a , double b){
		double sabiranje= a+b;
		return sabiranje;
			}
	public static double oduzimanje (double a,double b){
		double oduzimanje = a -b;
		return oduzimanje;
	}
	public static double mnozenje (double a,double b){
		double mnozenje= a*b;
		return mnozenje;
	}
	public static double dijeljenje (double a, double b){
		double dijeljenje= a / b;
		return dijeljenje;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesi 4 broja");
		
		int broj1= TextIO.getInt();
		int broj2 = TextIO.getInt();
		double broj3=TextIO.getDouble();
		double broj4=TextIO.getDouble();
		int sabiranje=sabiranje(broj1,broj2);
		int oduzimanje=oduzimanje(broj1,broj2);
		int mnozenje=mnozenje(broj1,broj2);
		int dijeljenje=dijeljenje(broj1,broj2);
		double sabiranje1=sabiranje(broj3,broj4);
		double oduzimanje1=oduzimanje(broj3,broj4);
		double mnozenje1=mnozenje(broj3,broj2);
		double dijeljenje1=dijeljenje(broj3,broj4);
		System.out.println("sabiranje " + sabiranje);
		System.out.println("oduzimanje " + oduzimanje);
		System.out.println("mnozenje " + mnozenje);
		System.out.println("dijeljenje " + dijeljenje);
		System.out.println("doubleSabiranje " + sabiranje1);
		System.out.println("doubleOduzimanje " + oduzimanje1);
		System.out.println("doubleMnozenje " + mnozenje1);
		System.out.println("doubleDijeljenje "+ dijeljenje1);
		
	}

}
