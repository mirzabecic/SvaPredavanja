import java.io.IOException;


public class Test {
	public static void main(String[] args) {
		try {
			CSVBuilder.saveObject("Users", new User("sanela",25	, false));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String[] str = {"sanela"," 25", "false"};
		User newUser = CSVBuilder.findObject(str);
		System.out.println(newUser.toString());
	
	}
}
