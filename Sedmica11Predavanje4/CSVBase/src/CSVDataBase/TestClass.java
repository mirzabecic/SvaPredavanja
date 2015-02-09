package CSVDataBase;

public class TestClass {
	public static void main(String[] args) {
		CSV user = new CSV("mirza", "becic", 21, false);
		System.out.println(user.toCSVString(", "));
		CSVReadWrite.writeToFile("user",user.toCSVString(","));
	}

}
