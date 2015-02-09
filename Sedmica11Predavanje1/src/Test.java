import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {
	public static void main(String[] args) {
		InputStream dis = new DataInputStream(System.in);
		Reader read = new InputStreamReader(System.in);
		byte[] buffer = new byte[4];

		int numBytesRead;

		try {
			while ((numBytesRead = dis.read(buffer)) >= 0) {
				System.out.println("procitali: " +numBytesRead + " bytea\n" + new String(buffer));
				BufferedInputStream bis = new BufferedInputStream(dis);
				//bis.
				//byte[]buffer = new byte[4];
				
				//for (int i = 0; i < buffer.length; i++){
				//	buffer[i] = 0;
				//}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
