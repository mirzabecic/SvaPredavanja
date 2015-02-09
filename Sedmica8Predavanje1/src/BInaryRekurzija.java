public class BInaryRekurzija {
	public static void main(String[] args) {
		int [] array = new int []{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(rekurzija(array, 0, array.length, 3));
	}

	public static int rekurzija(int[] array, int start, int end, int num) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (num == array[mid]) {
				return mid;

			} else if (num < array[mid]) {
				end = mid - 1;
			} else if(num > array[mid]){
					start = mid + 1;

			}else if ( num > 10 || num < 1)
				return -1;
			rekurzija(array, start, end, num);
		}
		return rekurzija(array, start, end, num);
		
	}

}
