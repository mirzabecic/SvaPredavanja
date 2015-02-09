import java.util.Scanner;



public class provjeraBroja {
	public static void main(String[] args) {
		System.out.println("unesi 3 broja");
		Scanner unos = new Scanner(System.in);
		int a = unos.nextInt();
		int b = unos.nextInt();
		int c = unos.nextInt();
		if (a<b && a<c){
			System.out.println("prvi broj je najmanji broj");
		}
		else if ( b<a && b<c){
			System.out.println("drugi broj je najmanji broj");
		}
			else {
				System.out.println ("treci broj je najmanji broj");
			}
			
			}
		}
	


