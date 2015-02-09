public class CountPrimes {
	private int a;
	private int b;

	public CountPrimes(int a, int b) {
		this.a = a;
		this.b = b;

	}

	public static int CountPrimes(int a, int b) {

		int counter = 0;

		for (int i = a; i <= b; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}

			}
			if (isPrime) {
				counter++;
			}
			// System.out.println(i + " ");
			// }
		}
		return counter;

	}

	public static void main(String[] args) {
		CountPrimes(2, 20);
	}

}
