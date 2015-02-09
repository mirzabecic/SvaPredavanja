
public class noveOperacije {
	public static void main(String[] args) {
		System.out.println("Upisi dva broja i operaciju koju zelis da se obavi");
		if (args[2].charAt(0)=='+'){
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
		}else if(args[2].charAt(0)=='-'){
			System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[1]));
			
		}else if(args[2].charAt(0)=='*'){
			System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[1]));
		}else if(args[2].charAt(0)=='/'){
			System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[1]));
		
		}else if(args[2].charAt(0)=='^'){
			System.out.println(Integer.parseInt(args[0]) ^ Integer.parseInt(args[1]));
		}
	}

}
