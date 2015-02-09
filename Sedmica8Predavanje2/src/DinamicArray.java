public class DinamicArray {
	private int[] array;
	private int count;

	final int INIT_SIZE = 5;

	public DinamicArray(int size) {
		this.array = new int[size];
		this.count = 0;

	}

	public DinamicArray() {
		this.array = new int[INIT_SIZE];
		this.count = 0;
	}

	public int getSize() {
		return count;
	}

	public void add(int newElement) {
		if (count == array.length) {
			resize();
		}
		array[count] = newElement;
		count++;
	}

	private void resize() {
		int[] tmp = array;
		array = new int[tmp.length * 2];
		for (int i = 0; i < count; i++) {
			array[i] = tmp[i];

		}
	}
	public int getAt(int index){
		if (index < count || index > 0)
		return array[index];
		else
			throw new IndexOutOfBoundsException("Exc out of bounds");
	}
	private void removeAt(int index){
		if (count <= index  || index < 0){
		throw new IndexOutOfBoundsException("Exc out of bounds");
		}else{
		for (int i = 0; i < count; i++){
			array[i] = array [ i + 1];
			
		}
		count --;
		}
	}
	private int[] toArray(){
		int []array = new int [count];
		for( int i = 0; i < array.length; i++){
			array[i] = this.array[i];
		}
		return array;
	}

}
