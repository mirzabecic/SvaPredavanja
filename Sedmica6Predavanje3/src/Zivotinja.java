
public class Zivotinja {
	private String ime;
	private int brojNogu;
	private String tip;
	
	public Zivotinja(String setIme, String setTip,int setBrojNogu){
		this.ime = setIme;
		this.tip = setTip;
		this.brojNogu = setBrojNogu;
		
	}
	public Zivotinja(Zivotinja other){
		this.ime=other.ime;
		this.tip=other.tip;
		this.brojNogu=other.brojNogu;
	}
	public String toString (){
		String ispis = "Ime zivotinje: " + ime + " Broj nogu: " + brojNogu + " tip: " + tip;
		return ispis;
	}
	

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrojNogu() {
		return brojNogu;
	}

	public void setBrojNogu(int brojNogu) {
		this.brojNogu = brojNogu;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
	
	

}
