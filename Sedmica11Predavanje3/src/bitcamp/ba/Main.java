package bitcamp.ba;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		User u = new User("Mirza", 21, true);
		File file = new File("./Folder/fileKojiJePrazan");
		if (file.length() == 0) {
			FileOutputStream fos = new FileOutputStream(file);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			BufferedWriter bw = new BufferedWriter(osw);
			bw.write(u.toString());
			bw.close();
		} else {
			InputStream input = new BufferedInputStream(new FileInputStream(
					file));
			byte[] buffer = new byte[8192];
			try {
				for (int length = 0; (length = input.read(buffer)) != -1;) {
					System.out.write(buffer, 0, length);
				}
			} finally {
				input.close();
			}
		}

	}

}
