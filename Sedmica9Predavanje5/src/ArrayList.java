import java.util.Collection;


public class ArrayList <T>{
	private T [] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	public ArrayList() {
		size = 0;
		array = (T[])(new Collection[DEFAULT_SIZE]);
	}
	

		public void add(T value) {
		if (size == array.length){
			resize();
		}
		array[size++] = value;
	}

	private void resize() {
		T[] tmp = (T[])(new Collection[array.length * 2]);
		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];
		}
		array = tmp;
	}

	public String toString() {
		String elements = "";
		for (int i = 0; i < size; i++) {
			elements += array[i] + " ";
		}
		return "Elements of array list: [" + elements + "].";
	}
	public void remove(int index){
		if( index < 0 || index > array.length){
			throw new IndexOutOfBoundsException("Index aint valid");
			
		}
		for (int i = index ; i < size -1; i++){
			array[i] = array[i +1];
			
		}		
		size--;
	}
	public void addAt(T value, int index){
		if (size == index ){
		resize();
		}
		for(int i = size; i < index; i--){
			array[i] =  array[i - 1];
			
		}
		size++;
	}

}


