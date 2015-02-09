import java.io.*;

public class StreamReadWrite {

	private static void cleanBuffer(byte[] buffer, int numRead) {
		for (int i = 0; i < numRead; i++) {
			buffer[i] = 0;
		}
	}
	public static void main(String[] args) {
		FileInputStream fs = null;
		Reader is;
		OutputStream os;
		StringBuilder sb = new StringBuilder();
		FileOutputStream ofs;
		byte[] inputBuffer = new byte[10];
		
		
		
		
		try {
			fs = new FileInputStream("./Folder/nekoIme.txt");
			is = new InputStreamReader(fs);
			ofs = new FileOutputStream("./Folder/nekoIme.txt", true);
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