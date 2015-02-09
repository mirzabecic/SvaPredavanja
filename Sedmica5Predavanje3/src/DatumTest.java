import sun.misc.Compare;


public class DatumTest {
	public static void main(String[] args) {
		Datum prviDatum = new Datum(10,12,2014);
		Datum drugiDatum= new Datum(prviDatum.getDan(),prviDatum.getMjesec(),prviDatum.getGodina());
		drugiDatum.setDan(15);
		Datum testDatum = new Datum();
		testDatum.novaGodina();
		System.out.println(testDatum.toString());
		/*System.out.println(prviDatum.toString());
		System.out.println(prviDatum.getDan());
		System.out.println(prviDatum.getMjesec());
		System.out.println(prviDatum.getGodina());
		System.out.println(prviDatum.compare(drugiDatum));
		System.out.println(drugiDatum);*/
	}

}
