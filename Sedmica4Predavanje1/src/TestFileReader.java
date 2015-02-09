import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class TestFileReader {
    public static void main(String[] args) {
		Scanner fin;
    	try {
			 fin = new Scanner (new File("test.txt"));
			 while (fin.hasNext()){
				 System.out.println(fin.nextLine());
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
