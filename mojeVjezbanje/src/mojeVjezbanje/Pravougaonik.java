package mojeVjezbanje;

public class Pravougaonik extends GeomOblik{
	private double duzina;
	private double sirina;
	public Pravougaonik(double duzina,double sirina){
		super(duzina * sirina, 2 * (duzina + sirina));
		this.duzina = duzina;
		this.sirina = sirina;
		
	}
	public String toString(){
		String ispisPravougaonika="Stranica a= " + duzina + "\nstranica b= " + sirina + "\nPovrsina= " + getPovrsina() + "\nObim= " + getObim();
		return ispisPravougaonika;
	}

}
