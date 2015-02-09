
public class Student {
	private String ime;
	private String prezime;
	private static int brojStudenata = 0;
    private int brIndexa;
    private Datum datumRodjenja;
    private Datum datumUpisa;
    
    
	public Student(String postaviIme,String postaviPrezime,  Datum postaviDatumRodjenja,Datum postaviDatumUpisa){
		
		this.ime=postaviIme;
		this.prezime=postaviPrezime;
		brojStudenata++;
		brIndexa=brojStudenata;
		this.datumRodjenja=postaviDatumRodjenja;
		this.datumUpisa=postaviDatumUpisa;
		
		
		
	}
	public Student (Student other){
		this.ime=other.ime;
		this.prezime=other.prezime;
		this.datumRodjenja=other.datumRodjenja;
		this.datumUpisa=other.datumUpisa;
	}
	public Datum getDatumRodjenja(){
		return datumRodjenja;
	}
	public Datum getDatumUpisa(){
		return datumUpisa;
	}
	public String getIme(){
		return ime;
	}
	public String getPrezime(){
		return prezime;
	}
	public int getBrStudenata(){
	return brojStudenata;
	}
	public int getBrIndexa(){
	return brIndexa;
    }
	public String toString (){
		String ispis="";
		ispis="" + ime +"" + prezime + ""+ brojStudenata + "" + brIndexa;
		return ispis;
	}
	
}
