
public class Temperatura {
	private int temperatura;
	private char tip;
	
	
	public Temperatura(int postaviTemperaturu,char postaviTip){
		temperatura= postaviTemperaturu;
		tip=postaviTip;
		
	}
	public int getTemperaturu(){
		return temperatura;
	}
	public int getTip(){
		return tip;
	}
	
	 public String toString(){
		 String  temperatura=" ";
		 temperatura=" temperatura: " + this.temperatura + " u: " + tip ;
		 return temperatura;
	 
		 
	 }
	 public Temperatura(Temperatura other){
		 this.temperatura=other.temperatura;
		 this.tip=other.tip;
		 
	 }
	 public void setVrsta(char tip){
		 if (tip !=  'c' || tip !='k' || tip != 'f' ){
			 throw new  IllegalArgumentException("mora biti kelvin ili celzijus ili farenheit");
				 		 
		 			 			 
		 }
		 
	 }
	 public double pretvaranje(char tipU){
		 double temp=0;
		 if ((tipU=='c') && (this.tip=='f')){
			  temp=this.temperatura + 273.15;
			  temp= this.temperatura * 1.8 +32;
		 }else if (tip=='k'){
			 double c=this.temperatura - 273.15;
			 double f=this.temperatura*1.8 - 459.67;
		 }else if ((tipU=='f') && (this.tip=='c')){
			temp= (this.temperatura - 32)/ 1.8;
			// double k= (this.temperatura + 459.67)/1.8;
			 }
		 return temp;
		 
	 }
	

}
