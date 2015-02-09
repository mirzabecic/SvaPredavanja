package mojeVjezbanje;

public class TestIspis {
	public static void main(String[] args) {
		Krug o1 = new Krug(2);
		Kvadrat k1 = new Kvadrat(3);
		Kvadrat k2 = new Kvadrat(6);
		Kvadrat k3 = new Kvadrat(2);
		Pravougaonik p1 = new Pravougaonik(5, 7);
		Pravougaonik p2 = new Pravougaonik(3,12);
		//System.out.println(o1.toString());
		System.out.println(o1.getPovrsina() * 7);
		System.out.println(k2.getPovrsina() + k3.getPovrsina() - k1.getPovrsina() * 2);
		System.out.println(p1.getPovrsina() *2 + p2.getPovrsina());
		System.out.println("Ukupna povrsina voza je =");
		System.out.println(o1.getPovrsina() * 7 - 2 * k1.getPovrsina() + k2.getPovrsina() + k3.getPovrsina() +  2 * p1.getPovrsina() + p2.getPovrsina());
	
		GeomOblik[] niz = new GeomOblik[5];
		niz[1] = new Krug(2.2);
		niz[2] = new 
	}

}
