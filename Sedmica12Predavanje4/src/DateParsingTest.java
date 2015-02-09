import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;




public class DateParsingTest {
	public static void main(String[] args)  
	{
		Scanner s = new Scanner(System.in);
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy. HH:mm");
		
		while(true){
			System.out.println("Unesite datum");
			String dateString = s.nextLine();
			if(dateString.isEmpty()){ break;}
			Date d;
			try {
				d = df.parse(dateString);
				System.out.printf("Unijeli ste datum: %s\n",d);
				System.out.printf("Formatirani datum je: %s\n", df.format(d));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
