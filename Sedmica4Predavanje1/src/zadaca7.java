
public class zadaca7 {
	public static void main(String[] args) {
		int exam=TextIO.getInt();
		int programsDone=TextIO.getInt();
		if ((exam>=60) && (programsDone>=10)){
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}

}
