
public class TestTemperatura {
	public static void main(String[] args) {
		Temperatura nova= new Temperatura(20, 's');
		nova.pretvaranje('d');
		double temp2=nova.pretvaranje('d');
		System.out.println(temp2);
		
		
	}

}
