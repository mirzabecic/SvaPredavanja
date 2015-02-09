
public class mjeracVremena {
	public static void main(String[] args) {
		System.out.println("Upisi Sat,minute i sekunde");
		int Sat = TextIO.getInt();
		int Minute = TextIO.getInt();
		int Sekunde = TextIO.getInt();
		int satUSekundama = Sat * 3600;
		int minuteUSekundama = Minute * 60;
		int rezultat1 = satUSekundama + minuteUSekundama + Sekunde;
		System.out.println("Upisi opet isto");
		Sat = TextIO.getInt();
		Minute = TextIO.getInt();
		Sekunde = TextIO.getInt();
		int satUSekundama2 = Sat * 3600;
		int minuteUSekundama2 = Minute * 60;
				int rezultat2 = satUSekundama2 + minuteUSekundama2 + Sekunde;
				if ( rezultat1 > rezultat2)
					System.out.println (rezultat1 - rezultat2);
				
					else 
				
						System.out.println(rezultat2 - rezultat1);
						
					
			
				
		
		
		
	}

}
