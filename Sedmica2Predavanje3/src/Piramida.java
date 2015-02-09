
public class Piramida {
	/**
	 * ispisuje piramidu:
	 * 1
	 * 12
	 * 123
	 * ...
	 * 123...n
	 * @param n - prirodan broj
	 */
	public static void piramida2(int n){
		for(int i =1;i<=n;i++){
			for ( int j=1; j<=i; j++);
			System.out.printf("%2d",n);
			
			
			
		}
	}
	
	public static void main(String[] args) {
		piramida1(6);
	}

}
