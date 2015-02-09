
public class Horoskop {
	public static void main(String[] args) {
		System.out.println("Unesite dan i mjesec rodjenja");
		int dan=TextIO.getInt();
		int mjesec=TextIO.getInt();
	if ( dan >31 || mjesec >12 || dan > 1){
		System.out.println("ne zajebavaj");
	}
		
		if ((dan>=21 && mjesec==3) || (dan<=19 && mjesec==4)){
		   System.out.println("Vas horoskopski znak je Ovan");
		}
		if ((dan>=20 && mjesec ==4) || (dan<=20 && mjesec == 5)){
			System.out.println("Vas horoskopski znak je Bik");
		}
		if ((dan>=20 && mjesec ==5) || (dan<=20 && mjesec == 6)){
			System.out.println("Vas horoskopski znak je Blizanci");
		}
		if ((dan>=21 && mjesec ==6) || (dan<=20 && mjesec == 7)){
			System.out.println("Vas horoskopski znak je Rak");
		}
		if ((dan>=21 && mjesec ==7) || (dan<=22 && mjesec == 8)){
			System.out.println("Vas horoskopski znak je Lav");
		}
		if ((dan>=23 && mjesec ==8) || (dan<=22 && mjesec == 9)){
			System.out.println("Vas horoskopski znak je Djevica");
		}
		if ((dan>=23 && mjesec ==9) || (dan<=22 && mjesec == 10)){
			System.out.println("Vas horoskopski znak je Vaga");
		}
		if ((dan>=23 && mjesec ==10) || (dan<=21 && mjesec == 11)){
			System.out.println("Vas horoskopski znak je Skorpija");
		}
		if ((dan>=22 && mjesec ==11) || (dan<=21 && mjesec == 12)){
			System.out.println("Vas horoskopski znak je Strijelac");
		}
		if ((dan>=22 && mjesec ==12) || (dan<=19 && mjesec == 1)){
			System.out.println("Vas horoskopski znak je Jarac");
		}
		if ((dan>=20&& mjesec ==1) || (dan<=18 && mjesec == 2)){
			System.out.println("Vas horoskopski znak je Vodolija");
		}
		if ((dan>=19 && mjesec ==2) || (dan<=20 && mjesec == 3)){
			System.out.println("Vas horoskopski znak je Ribe");
		}
	}

}
