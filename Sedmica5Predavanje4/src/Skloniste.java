
public class Skloniste {
	private Zivotinja [] zivotinje;
	private int numZivotinja;
	private Zivotinja [] novezivotinje;
	
	
	public Skloniste(){
		zivotinje = new Zivotinja[10];
		numZivotinja=0;
	}
	public void addZivotinja(String name,String type,int numLegs){
		zivotinje[numZivotinja]= new Zivotinja(name,type,numLegs);
		numZivotinja++;
		if (numZivotinja== zivotinje.length){
			resizeZivotinja();
		}
	}
	public void addZivotinja(String name,String type){
		zivotinje[numZivotinja]= new Zivotinja(name,type);
		numZivotinja++;
		
	}
	public void resizeZivotinja(){
		int newLength=2*zivotinje.length;
	    Zivotinja [] temp = new Zivotinja [newLength];
	    for (int i = 0;i <zivotinje.length;i++){
	    	temp[i]= zivotinje[i];
	    }
	    zivotinje = temp;
	}
	public String toString (){
		String sklonisteKaoString="";
		
		for (int i =0;i<numZivotinja;i++){
			sklonisteKaoString+=zivotinje[i].toString();
			
		}
		return sklonisteKaoString;
	}
	
}


