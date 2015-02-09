
public class Zivotinja {
	private String name;
	private String type;
	private int numLegs;
	
	public Zivotinja(String novoIme,String novaVrsta, int novibrojNogu){
		this.name=novoIme;
		this. type= novaVrsta;
		this.setZivotinja(novibrojNogu);
	}
	public Zivotinja( String novoIme,String novaVrsta){
		this.name=novoIme;
		this.type=novaVrsta;
	}
	public Zivotinja(){
		name="nepoznato";
		type="nepoznato";
		numLegs=0;
	}
	public String toString (){
		String ispis="";
		ispis="ime: " + name+" \nvrsta: " + type + " \nbroj nogu: "+ numLegs;
		return ispis;
	}
	public void setZivotinja(int numLegs){
		if ((this.type.equals("pas")) || (this.type.equals("macka")) || (this.type.equals("konj")) && (numLegs>4) || (numLegs<1)){
			this.numLegs=4;
			}else if((this.type.equals("ptica")) && (numLegs>2) || (numLegs<1)){
				this.numLegs=2;
			}else {
				this.numLegs=0;
			}
	}
	public String  getName(){
		return name;
	}
	public String getType(){
		return type;
		
	}
	public int getNumLegs(){
		return numLegs;
	}
	public void setName(String type){
		if (this.type.equals("pas") || this.type.equals("macka") || this.type.equals("konj") || this.type.equals("ptica") || this.type.equals("riba")){
			this.type=type;
		}
	}
	
	}
	


