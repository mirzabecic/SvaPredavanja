package CSVDataBase;

public class CSV {
	private String ime;
	private String prezime;
	private int age;
	private boolean driverLicense;
	
	public CSV(String ime, String prezime, int age, boolean driverLicense){
		this.ime = ime;
		this.prezime = prezime;
		this.age = age;
		this.driverLicense = driverLicense;
		
	}
	public String toCSVString (String delimeter){
		String write = ime + delimeter + prezime + delimeter + age + delimeter + driverLicense;
		return write;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isDriverLicense() {
		return driverLicense;
	}
	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}


}
