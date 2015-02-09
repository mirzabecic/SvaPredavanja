import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;

import javax.swing.JFileChooser;

public class CopyStreamReadWrite {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++) {
			buffer[i] = 0;
		}
	}
	public static void main(String[] args) {
		JFileChooser filePicker = new JFileChooser();
		
		filePicker.setCurrentDirectory(new File(System.getProperty("user.home") + "/Documents/workspace"));
		FileInputStream fs = null;
		
		int open = filePicker.showOpenDialog(filePicker);
		
		while (open == filePicker.CANCEL_OPTION){
			filePicker.showOpenDialog(filePicker);
		}
		String pickedFile = filePicker.getSelectedFile().getAbsolutePath();
		open = -1;
		while (open == filePicker.CANCEL_OPTION){
			filePicker.showOpenDialog(filePicker);
		}
		String pickedFile2 = filePicker.getSelectedFile().getAbsolutePath();
		
		Reader is;
		OutputStream os;
		StringBuilder sb = new StringBuilder();
		FileOutputStream ofs;
		byte[] inputBuffer = new byte[10];
		
		
		
		
		try {
			fs = new FileInputStream(pickedFile);
			is = new InputStreamReader(fs);
			ofs = new FileOutputStream(pickedFile2, true);
			os = new DataOutputStream(ofs);
			BufferedReader bs = new BufferedReader(is);
			
			int numRead = 0;
			String lineString = "";
			
			while ( (lineString = bs.readLine()) != null	){
				sb.append(lineString).append("\n");
			}
			//while ((numRead = is.read(inputBuffer)) >= 0) {
			//	sb.append(new String(inputBuffer));
			//	cleanBuffer(inputBuffer, numRead);
		//	}
			System.out.println("Citanje zavrseno!");
			String outputString = sb.toString();
			os.write(outputString.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}