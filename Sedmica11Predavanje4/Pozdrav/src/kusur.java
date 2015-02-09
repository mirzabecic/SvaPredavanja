import java.util.Scanner;


public class kusur {
public static void main(String[] args) {
	Scanner unos= new Scanner(System.in);
	int kusur=unos.nextInt();
	double quarter=kusur * 0.25;
	System.out.println(quarter);
	int kusur2=unos.nextInt();
	double dimes=kusur2*0.10;
	System.out.println(dimes);
	int kusur3=unos.nextInt();
	double nickles=kusur3*0.05;
	System.out.println(nickles);
	int kusur4=unos.nextInt();
	double penies=kusur4*0.01;
	System.out.println(penies);
	double rezultat= quarter + dimes + nickles + penies;
	System.out.println(rezultat + "$");
	
}
}
