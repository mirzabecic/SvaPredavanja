package mojeVjezbanje;

public class GeomOblik {
	private double povrsina;
	private double obim;
	
	
	public GeomOblik(double povrsina,double obim){
		this.povrsina=povrsina;
		this.obim=obim;
	}
	public double getPovrsina() {
		return povrsina;
	}
	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
	public double getObim() {
		return obim;
	}
	public void setObim(double obim) {
		this.obim = obim;
	}
	
	

}
