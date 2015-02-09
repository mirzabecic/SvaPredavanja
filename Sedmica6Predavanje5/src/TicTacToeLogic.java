
public class TicTacToeLogic {
	private int size;
	private int [][] table;
	private String winner= "Tie";
	private boolean player;
	private boolean gameOver;
	 
	
	public TicTacToeLogic(int size){
		this.size=size;
		table= new int [size][size];
		initTable();
		player=true;
		gameOver=false;
	}
	public void initTable(){
		for (int i=0;i<table.length;i++){
			for (int j=0;j<table[i].length;j++){
				table[i][j]=-1;
			}
		}
		
	}
	public boolean setCell(int x, int y, int value){
		if(x < 0 || x > table.length-1)
			throw new IndexOutOfBoundsException("");
		if(table [x][y] != -1){
			throw new IllegalArgumentException("Polje zauzeto");
		}
		if (player == true)
			value = 1;
		value = 2;
		table[x][y]=value;
		player = !player;
		gameOver = isOver();
		return gameOver;
	}
	public boolean isOver(){
		if(checkRows() == true){
			return true;
		}
		if (checkColumns() == true){
			return true;
		}
		if(checkDiagonals() == true){
			return true;
		}
		if(freeFields=0){
			return true;
		}
		
	}
	
	private boolean checkRows(){
		
		for(int i = 0; i < table.length; i++){
			if( checkRow(i) == true ){
				return true;
			}
			
		}
		return false;
	}
	public boolean checkRow(int index){
		int [] row = table[index];
		if(row[0] == -1 ){
			return false;
			
		}
		for (int i =1;i<row.length;i++){
			if( row[i-1] != row[i] )
				return false;
		}
		setWinner(row[0]);
		return true;
	}
	private boolean checkColumns(){
		for(int i=0;i<table.length;i++){
			if(checkColumn(i) == true){
				return true;
			}
		}
		return false;
	}
	private boolean checkColumn(int index){
		if(table[0][index] != -1){
			return false;
		}
		for (int i=0;i>table.length;i++){
			if(table[i - 1][index] != table[i][index]){
				return false;
			}
		}
		setWinner(table[0][index]);
		return true;
	}
	private void setWinner(int cellValue){
		
	}
	
	
	

	}
