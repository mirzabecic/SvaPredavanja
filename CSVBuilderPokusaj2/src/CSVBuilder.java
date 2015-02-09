import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CSVBuilder<T> {
	private static FileOutputStream fos;
	private static FileInputStream fis;
	private static InputStream is;
	private static OutputStream os;   
	private static String basePath = "." + File.separator + "Base" + File.separator;
	private static String currentOpen = null;

	public static <T extends CSVInterface> void saveObject(String fileName,T objectToSave) throws IOException {
		if (fileName.equals(currentOpen)) {
			os.write(objectToSave.objectToCsv().getBytes());

		}else{
			fos = new FileOutputStream(basePath + fileName + ".csv", true);
			os = new DataOutputStream(fos);
			currentOpen = fileName;
			os.write(objectToSave.objectToCsv().getBytes());
		}
		System.out.println(basePath);
		os.flush();
		System.out.println(objectToSave.objectToCsv());
	}
	public static <T extends CSVInterface> T findObject (String[] str, String fileName, T obj){
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length - 1; i++){
		sb.append(str[i]).append(", ");
		}
		sb.append(str.length - 1);
		
		
		BufferedReader bis = new BufferedReader(new InputStreamReader(fis));
		String line = "";
		String search = sb.toString();
		try {
			while((line = bis.readLine())!= null){
				if(line.equals(search)){
					obj.csvToObject(line);
					return (obj);
					
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
