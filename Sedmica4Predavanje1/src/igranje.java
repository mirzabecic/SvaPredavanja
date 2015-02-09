import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class igranje {
     public static void main(String[] args) {
    	 FileWriter fw;
    	 try {
			 fw = new FileWriter(new File("test.txt"));
			 fw.append("Evo jedan red");
			 fw.append('\n');
			 fw.flush();
			 fw.append("Drugi red\nItreci red. ");
			 fw.append ('\n');
			 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
