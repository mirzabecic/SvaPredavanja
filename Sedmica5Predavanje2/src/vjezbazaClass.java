
public class vjezbazaClass {
	public static void main(String[] args) {
		
		User variabla;
		variabla = unosPodataka();
		ispis(variabla);
		User variabla2;
		variabla2= unosPodataka();
		ispis(variabla2);
		if (variabla.brojGodina>variabla2.brojGodina){
			System.out.println(variabla.brojGodina);
		}else{
			System.out.println(variabla2.brojGodina);
		}
		
	}
	public static User  unosPodataka(){
		User unos= new User();
		System.out.println("Unesite ime");
		unos.ime=TextIO.getln();
		
		System.out.println("Unesite prezime");
		unos.prezime=TextIO.getln();
		
		System.out.println("Koliko imate godina");
		unos.brojGodina=TextIO.getlnInt();
		return unos;
		
		
	}public static void ispis(User a){
	System.out.printf("%s %s %s \n",a.ime,a.prezime,a.brojGodina);
	}
}
