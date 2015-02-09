package bitcamp.ba;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class FirstEx {

	public static void fileToSysOut(File file) throws IOException {

		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
	}

	public static void fileToFile(File from, File into) throws IOException {
		FileInputStream fis = new FileInputStream(from);
		FileOutputStream fos = new FileOutputStream(into);

		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		OutputStream os = new DataOutputStream(fos);
		String line = "";
		while ((line = br.readLine()) != null) {
			fos.write(line.getBytes());
			fos.write("\n".getBytes());
		}
	//	fos.close();

	}

}
