
public class unosIme {
	public static String getInputString(String poruka){
		System.out.println("Upisi ime i prezime");
		String myString=TextIO.getInputFileName();
          
          return myString;
	}
	public static int getInputInt(String poruka){
		System.out.println("upisi broj");
		int broj1=TextIO.getInt();
		return broj1;
	}
	public static double getInputDouble(String poruka){
		System.out.println("upisi broj drugi");
		double myDouble=TextIO.getDouble();
		return myDouble;
		
	}
	public static void main(String[] args) {
		
		String myString=getInputString("Unesi string");
		int num1=getInputInt("Unesi integer");
		double myDouble=getInputDouble("Unesi double");
		    System.out.println("Unesi string " + myString);
		    System.out.println("Unesi int = " + num1);
		    System.out.println("Unesi double = " + myDouble);
		
		
	}

}
