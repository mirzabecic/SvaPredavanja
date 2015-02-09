
public class trokut {
	public static void main(String[] args) {
		int a =TextIO.getInt();
		int b =TextIO.getInt();
		int c =TextIO.getInt();
		double s;
		double p=0;
		
		if ( a > b+ c){
		System.out.println ("Trokut se ne moze dobiti");
		}
		else 
		{	s = (a +b + c) / 2 ;
		p = Math.sqrt(s*(s - a ) * (s - b) * (s - c));
		}
		System.out.println("Povrisna trougla je " + p);
		
	}

}
