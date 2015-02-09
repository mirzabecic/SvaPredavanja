package mojeVjezbanje;

public class Krug extends GeomOblik{
	private double poluprecnik;

	public Krug (double poluprecnik) {
		super(poluprecnik * poluprecnik * Math.PI, 2 * poluprecnik * Math.PI);
		this.poluprecnik = poluprecnik;
	}
	public String toString(){
		String ispisKruga ="poluprecnik=" + poluprecnik + "\npovrsina=" + this.getPovrsina() + "\nobim" + getObim();
		return ispisKruga;
	}

}
