
public class ToyStore {
	

		private String name;
		private Toy[] inventory;
		private int numToys=0;



		public ToyStore(String name) {
		setName(name);
		inventory= new Toy[1];

		}
		public String getName() {
		return name;

		}
		public void setName(String name) {
		this.name = name;
		}
		public String toString(){
		String out="";
		out+="Name: "	+	name;
		out+= "\nToy list: \n";
		for(int i =0;i< inventory.length;i++){
		out+= "\t"+inventory[i].toString();
		}
		out+="\n";
		return out;

		}
		public void addToy(Toy newToy){
			for (int i=0;i<numToys;i++){
				if(this.inventory[i].equals(newToy)){
					
				}
			}
			this.intventory[numToys]= new Toy(newToy);
			numToys++;
			if(numToys==this.intventory.length){
				
				
			}
		}

		}
