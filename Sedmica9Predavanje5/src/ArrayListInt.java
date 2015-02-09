public class ArrayListInt {
	private int[] array;
	private int size;
	private final int DEFAULT_SIZE = 10;

	public ArrayListInt() {
		size = 0;
		array = new int[DEFAULT_SIZE];
	}

	public void test() {
		this.array[0] = 1;
		this.array[1] = 2;
		this.array[2] = 3;
		this.array[3] = 4;

		resize();

		for (int i = 0; i < 4; i++)
			System.out.println(array[i]);

	}

	public void add(int value) {
		if (size == array.length){
			resize();
		}
		array[size++] = value;
	}

	private void resize() {
		int[] tmp = new int[array.length * 2];
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
	public void addAt(int value, int index){
		if (size == index ){
		resize();
		}
		for(int i = size; i < index; i--){
			array[i] =  array[i - 1];
			
		}
	}

}
