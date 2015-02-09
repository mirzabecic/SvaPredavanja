
public class MySorting {
	public static void main(String[] args) {
		int [] array = new int []{2, 7, 3, 4, 5, 1, 6, 12, 24};
		SelectionSort(array);
		for (int n : array){
		System.out.println(n);
		}
	}
	public static void SelectionSort (int [] array){
		int lowNumber;
		int curNumber;
		for (int i = 0; i <array.length - 1; i++){
			lowNumber = i;
			for (int j = i +1; j < array.length; j++){
				if(array[j] < array[lowNumber]){
					lowNumber = j;
				}
					
			}
			if (lowNumber != i){
				int tmp =array[lowNumber];
				array[lowNumber] = array[i];
				array[i]  = tmp;
			}
		}
		
	}
}
