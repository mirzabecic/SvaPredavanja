import java.util.Date;


public class TestDate {
	public static void main(String[] args) {
		Date startDate = new Date();
		CountPrimes a = new CountPrimes( 1, 20);
		a.CountPrimes(1, 2000000);
		Date endDate = new Date();
		double time = (double)(endDate.getTime() - startDate.getTime())/1000;
		System.out.println("Proslo je: " + time);
		System.out.println();
		
	}

}
