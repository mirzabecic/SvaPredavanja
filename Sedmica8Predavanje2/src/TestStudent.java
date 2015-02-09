
public class TestStudent {
	public static void main(String[] args) {
		Student [] Studentarray = new Student [] {
		new Student ("Mirza", 5, 7.0),
		new Student ("Emir", 6, 8.0),
		new Student ("Haris", 4,7.3)
		};
		SelectionSort(Studentarray);
		for (Student n : Studentarray){
			System.out.println(n.toString());
		}
		
	}
	public static void SelectionSort( Student [] array){
		int lowNumber;
		for (int i = 0; i <array.length - 1; i++){
			lowNumber = i;
			for (int j = i +1; j < array.length; j++){
				if(array[j].compareTo(array[lowNumber]) < 0){
					lowNumber = j;
				}
					
			}
			if (lowNumber != i){
				Student tmp =array[lowNumber];
				array[lowNumber] = array[i];
				array[i]  = tmp;
			}
		}
		
	}

}
