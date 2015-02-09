
public class DHLPaket {
		
	Package novi= new Package();
		
		
	    private double height;
	    private double length;
	    private double weight;
	    private double width;
		
	    
	    public double getHeight() {
	    	return height;
		}
		public void setHeight(double height) {
			if(height<0){
				throw new IllegalArgumentException("Ne moze biti nizi od 0 cm");
			}
			this.height = height;
		}
		public double getLength() {
			return length;
		}
		public void setLength(double length) {
			if (length<0){
				throw new IllegalArgumentException("Mora biti vece");
			}
			this.length = length;
		}
		public double getWeight() {
			return weight;
		}
		public void setWeight(double weight) {
			if (weight<0){
				throw new IllegalArgumentException("Ne moze biti lakse od 0 kg");
			}
			this.weight = weight;
		}
		public double getWidth() {
			return width;
		}
		public void setWidth(double width) {
			this.width = width;
		}
		public double setPrice(){
			double setPrice=weight*3;
			return setPrice;
		}
		public String toString(){
			return "Paket ("+ getWidth() +"x"+ getWeight()+ "x" + getHeight()+ "x" + getLength() + "x " + setPrice();
		}
		public double  getDimensionalWeight(){
			return izracunavanje.racunanje(height, width, length);
			
			
		}
		
		
	}



