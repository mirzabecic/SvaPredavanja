public class vjezba1 {
	public static void main(String[] args) {
		int[] array;
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);

		}
		System.out.println("Type in number");
		boolean isIn = false;
		int number = TextIO.getInt();
		for (int i = 0; i < 10; i++) {
			if (number == array[i]) {
				System.out.println("Number is on spot:" + i);
				isIn = true;
			
			}
		}
		if (!isIn){
			System.out.println("Number is not IN GARAGE");
		}
	}

}
