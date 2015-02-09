
public class InsertionSort {
	public static void main(String[] args) {
		int [] numbers = new int [] {871, 12, 8, 98,19,15,25};
		insertionSort(numbers);
		for (int n : numbers){
			System.out.println(n);
		}
	}
	public static void insertionSort (int [] array){
		
		for (int i = 0; i < array.length; i++){
			int newPos = i;
			while (newPos >0 && array[newPos -1] > array[newPos]){
				int t = array[newPos - 1];
				array[newPos - 1] = array[newPos];
				array[newPos] = t;
				newPos--;
			}
		}
	}
	public static void bubbleSort(int[] array){
		for( int i = array.length - 1; i >= 0 ; i--){
			int max = array[0];
			for(int j = 1; j <=i; j++){
				if(array[j] > max){
					max = array[j];
				}
			}
		}
	}
}
