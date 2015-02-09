
public class Datum {
	private int dan;
	private int mjesec;
	private int godina;
	
	public Datum(){
		dan=1;
		mjesec=1;
		godina =1900;
		
	}
	/** 
	 * konstruktor , varijable koje sam kreirao , da bi ih izjednacio sa datumima u datumtest.java
	 * @param postaviDan
	 * @param postaviMjesec
	 * @param postaviGodinu
	 */
	public Datum(int postaviDan,int postaviMjesec, int postaviGodinu){
		dan = postaviDan;
		mjesec=postaviMjesec;
		godina=postaviGodinu;
	}
	/** 
	 * getter, saljes mu dan
	 * @return
	 */
	public int getDan(){
		return dan;
		
	}
	public String toString (){
		String datumKaoString = "";
	     datumKaoString = "" +dan +"." + mjesec +"."+ godina+"";
	     return datumKaoString;
		
	}
	/**
	 * getter koji salje mjesec i godinu
	 */
	public int getMjesec(){
		return mjesec;
	}
	public int getGodina(){
		return godina;
	}
	/**
	 * 
	 * @param noviDan
	 */
	public void setDan(int dan){
		if ( dan<0  || dan>31){
			throw new IllegalArgumentException("Dan nije u validnom intervalu");
		}else{
			this.dan=dan;
		}
	}
	public void setMjesec(int mjesec){
		if(mjesec<1 || mjesec>12){
			throw new IllegalArgumentException("Mjesec nije u validnom intervalu");
		}else {
			this.mjesec=mjesec;
		}
		
	}
	public void setGodina (int godina){
		if (godina<1900 || godina >3014){
			throw new IllegalArgumentException("Godina nije u validnom intervalu");
			
		}else{
			this.godina=godina;
		}
	}
	/** 
	 * kopira ulazni dan,mjesec,godina
	 * @param other
	 */
	public Datum(Datum other){
		this.dan=other.dan;
		this.mjesec=other.mjesec;
		this.godina=other.godina;
	}
	public boolean equals(Datum other){
		if ((this.dan==other.dan) && 		(this.mjesec==other.mjesec)	&&	(this.godina==other.godina)){
		return true;	
		}else{
			return false;
		}
		
	}
	public int compare(Datum other){
		if (this.godina>other.godina){
			return 1;
			
		}else if (this.godina==other.godina) {
			if (this.mjesec>other.mjesec){
				return 1;
			}else if (this.mjesec==other.mjesec){
				if(this.dan>other.dan){
					return 1;
				}else if (this.dan==other.dan){
					return 0;
				}
			}
			
		}
		return -1;
	}
	public static int randomDatumi();
	
	

}
