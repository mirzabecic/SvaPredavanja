
public class Card {
	private int broj;
	private int vrijednost;
	private char znak;
	
	public Card(int postaviBroj){
		
	this.broj = postaviBroj % 14;
	this.broj++;
	if (this.broj %14>=11)
		
	this.broj++;
		int temp = postaviBroj / 14;
		if( temp == 0){
			this.znak = 'S';
		}
		
		temp =postaviBroj/ 14;
		if(temp==1){
			this.znak='P';
		}
		temp=postaviBroj / 14;
		if(temp==2){
			this.znak='D';
		}
		 temp=postaviBroj/14;
		if(temp==3){
			this.znak='M';
		}
		if(this.broj>10){
			vrijednost=10;
			
		}else{
			vrijednost=this.broj;
		}
		if(this.broj>=11){
			this.broj++;
		}
		
		
	}
	public String toString(){
		String ispis="";
		ispis = "broj: " + broj + " znak: " + znak + "  vrijednost:" + vrijednost + "\n";
		return ispis;
	}
	public int getVrijednost(){
		return vrijednost;
	}
	

}
