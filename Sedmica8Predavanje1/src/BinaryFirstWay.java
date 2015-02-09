public class BinaryFirstWay {
	public static void main(String[] args) {

		int[] array = new int[] { 13, 24, 32, 43, 55, 66 };
		int result = binarySearchLoop(array, 32);
		System.out.println(result);
	}

	private static int binarySearchLoop(int[] array, int number) {
		int startArray = 0;
		int endArray = array.length;

		while (startArray <= endArray) {
			int mid = (startArray + endArray) / 2;
			if (number == array[mid]) {
				return mid;

			} else if (number < array[mid]) {
				endArray = mid - 1;
			} else {
				startArray = mid+1 ;
			}

		}
		return -1;
	}
}
