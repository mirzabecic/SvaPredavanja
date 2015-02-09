
public class Vic {
	public static void main(String[] args) {
		Turista t= new Turista();
		Osnovna o=new Osnovna();
		Srednja s= new Srednja();
		Fax f= new Fax();
		Policajac p= new Policajac();
		
		System.out.println(" Na stanici je turista, prolaznici i policajac. ");
		System.out.println("Turista trazi bus za grad i pita prvog prolaznika");
		t.pitaj("Da li je ovo bus za grad?",o);
		
	}

}
