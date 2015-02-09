
public class TestZivotinja {
public static void main(String[] args) {
	
	Zivotinja novaZivotinja = new Zivotinja("zuco","pas", 5);
	System.out.println(novaZivotinja.toString());
	Skloniste shelter= new Skloniste();
	 
	shelter.addZivotinja("Pujdo", "pas");
	shelter.addZivotinja("Cicko", "macka");
	shelter.addZivotinja("Rex", "ptica");
	shelter.addZivotinja("Mrva", "konj");
	shelter.addZivotinja("Rajcu", "riba");
	System.out.println(shelter.toString());
	
	
}

	
}

