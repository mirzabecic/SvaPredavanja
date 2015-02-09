
public class DinamicArrayOfString {
	private static final int INITIAL_NUMBER_OF_ELEMENTS = 4;
	String[] myArray;
	int myCount;
	
	public DinamicArrayOfString(int initNoOfElem) {
		super();
		myArray = new String[initNoOfElem];
		myCount = 0;
	}

	public DinamicArrayOfString() {
		this(INITIAL_NUMBER_OF_ELEMENTS);
	}
	

}
