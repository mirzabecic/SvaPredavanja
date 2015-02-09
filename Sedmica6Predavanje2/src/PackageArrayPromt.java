
public class PackageArrayPromt {
	public static void main(String[] args) {
		Package [] packages = new Package[3];
	for (int i =0;i<packages.length;i++){
		packages[i]=getPackage();
	}
	for (Package p:packages	){
		System.out.println(p);
	}
	}
	
		
		
		public static Package getPackage(){
		Package p=new Package();
		
		System.out.println("Unesire sirinu");
		p.setWidth(TextIO.getDouble());
		System.out.println("Unesite visinu");
		p.setHeight(TextIO.getDouble());
		System.out.println("Unesite duzinu");
		p.setLength(TextIO.getDouble());
		System.out.println("Unesite tezinu");
		p.setWeight(TextIO.getDouble());
		
	return p;
		}
		

}
