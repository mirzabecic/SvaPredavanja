package bitcamp.ba;

import java.io.File;
import java.io.IOException;

public class TextOfFirstEx  {
	public static void main(String[] args) throws IOException {
		FirstEx file = new FirstEx();
		file.fileToFile(new File("./filename"), new File("./copytoThisFilename"));
		System.out.println("prepisivanje gotovo");
		
	}

}
