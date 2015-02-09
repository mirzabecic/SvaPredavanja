


public class PokusajMina {
	public static void main(String[] args) {
		
	}

	public void otvoriPolje(int x, int y){
		if (x<1 || x>15|| y <0 || y >15){
			return;
		}
		if (tabla[x,y]== 0 && tabla[x,y]!=green){
			makeItGreen(x,y);
			otvoriPolje(x+1,y);  //desno
			otvoriPolje(x-1, y); // lijevo
			otvoriPolje(x, y+1); //gore
			otvoriPolje(x, y-1); //dole
		}
		return;
		
	}
	
}
