import testiPackage.TestnaKlasa;
import testiPackage.subPackage.testnaPodKlasa;


public class provjeraNapisanog {
	public static void main(String[] args) {
		testiPackage.TestnaKlasa.nekiIspisUTestnojKlasi();
		testnaPodKlasa.josNekiIspis("Evo nas sa importom!");
		TestnaKlasa.nekiIspisUTestnojKlasi();
		TestnaKlasa promjenjljivaTipaTestnaKlasa=new TestnaKlasa();
		promjenjljivaTipaTestnaKlasa.funkcijaBezStatica();
	}

}
