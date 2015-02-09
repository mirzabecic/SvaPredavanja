
public class Deck {
	private Card[]cards;
	private int brojac;
	
	public Deck(){
		cards= new Card[52];
		for (int i =0;i<cards.length;i++){
			                 cards[i]=new Card(i);
			                 
			                  
		}
		shuffle();
		
	}
	public String  Ispis(){
		
	String CardsToString="";
		for (int i =0;i<cards.length;i++){
           
            CardsToString+=cards[i].toString();
            
            
	}
	
		return CardsToString;
}
	public void shuffle(){
		Card temp;
		for (int i=0;i<cards.length;i++){
			int  card1=(int)(Math.random()*52);
			int  card2=(int)(Math.random()*52);
			temp=cards[card1];
			cards[card1]= cards[card2];
			cards[card2]=temp;
		}
	}
}