
public class Igrica {
	private Tabela poljanaZaIgru;
	private int aktivniIgrac;
	
	public Igrica(){
		poljanaZaIgru= new Tabela();
		aktivniIgrac=Polje.PRVI_IGRAC;
	}
	public boolean provjeriDaLiJeDozvoljenPotez(int i,int j){
		if(poljanaZaIgru.provjeriPolje(i, j))
		return poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja()== Polje.prazno_polje;
		return false;
	}
	public void odigrajPotez(int i, int j) throws Exception{
		if(provjeriDaLiJeDozvoljenPotez(i, j)){
			poljanaZaIgru.setPolje(aktivniIgrac, i, j);
			if(aktivniIgrac==Polje.PRVI_IGRAC){
				aktivniIgrac=Polje.DRUGI_IGRAC;
			}else{
				aktivniIgrac=Polje.PRVI_IGRAC;
			}
		}else{
		throw new Exception("Ne valjaju indeksi u odigrajPotez");
		
		}
	}
	public boolean daLiJeKraj(){
		boolean imaPraznih= false;
		for (int i=0;i<poljanaZaIgru.getVisinaMatrice();i++){
					for(int j=0;j<poljanaZaIgru.getSirinaMatrice();j++){
				imaPraznih |= (poljanaZaIgru.getPolje(i, j).vratiVrijednostPolja()==Polje.prazno_polje);
			}
		}
		if(!imaPraznih)
			return true;
		return nekoJePobjedio();
	}

}
