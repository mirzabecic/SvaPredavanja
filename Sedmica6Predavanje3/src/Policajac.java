
public class Policajac {
private int pitanje=0;

public String potvrdi(){
	if(pitanje==0){
		pitanje++;
		return "JESTE";
		}
	return "AHA";
	}
 	public String objasni(){
 		return "'AHA' = osnovna skola,'DA' = srednja , 'JESTE' = fax";
 	}
}
