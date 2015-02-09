package CSVDataBase;

public class CSVReadWrite {

	
	private static String basePath = "./DataBase/";
	
	public static boolean writeToFile(String fileName, String data){
		try{
		TextIO.writeFile(basePath + fileName + ".csv");
		TextIO.putln(data);
		} catch (Exception e){
			return false;
		}
		return true;
	}
}
