import java.util.Scanner;


public class provjeraDjeljivosti {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj=unos.nextInt();
		int dijeljenje1 = broj / 2;
		System.out.println(dijeljenje1);
		if (broj %2 == 0){
			System.out.println("broj je djeljiv sa 2");
		}
			else 
				System.out.println ("broj nije djeljiv sa 2");
		int dijeljenje2= broj / 3;
		System.out.println(dijeljenje2);
		if (broj%3 == 0){
			System.out.println("broj je djeljiv sa 3");
		}
			else 
				System.out.println ("broj nije djeljiv sa 3");
		int dijeljenje3= broj / 4;
		System.out.println(dijeljenje3);
		if (broj%4==0){
			System.out.println("broj je djeljiv sa 4");
		}
			else 
				System.out.println("broj nije djeljiv sa 4");
		if ((broj%2==0) && (broj%3==0)){
			System.out.println("Broj je djeljiv sa 6");
 			
		}
		
		}
		
	}


