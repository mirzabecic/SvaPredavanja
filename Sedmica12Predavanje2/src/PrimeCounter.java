import java.util.Date;

public class PrimeCounter extends Thread {
	private int start;
	private int end;
	private static int counter;
	private Date startTime;
	private Date endDate;

	public PrimeCounter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		counter = 0;

	}

	public static int CountPrimes(int start, int end) {

		for (int i = start; i <= end; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}
			if (isPrime) {
				counter++;
				System.out.println(i);
			}
		}
		return counter;
	}
	public void run(){
		
		CountPrimes(start,end);
		System.out.printf("Hello from %d! Just counted to %d. Total count is=%d\n", start, end,counter++);
	}

	public static void main(String[] args) {
		
		PrimeCounter[] pc = new PrimeCounter[1];
		for(int i = 0; i < pc.length; i++){
			pc[i] = new PrimeCounter(1,10000);
			pc[i].start();
		}
		
		
		

	}

}
