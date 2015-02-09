
public class HelloWorld {
public static void main(String[] args) {
	System.out.println("Ovo je \n\"Hello world\"");
	System.out.println("Ovo je \t\t test");
	System.out.println("Ovo je \t\t novi test");
	boolean tacno= true;
				System.out.println(tacno);
				String strTacno= String.valueOf(tacno);
				System.out.println(strTacno);
				String test= new String ("TEST");
				System.out.println(test);
				int lengthTest= test.length();
				System.out.println(lengthTest);
				String a= "vedad";
				String b= "VEDAD";
				boolean eq= a.equals(b);
				System.out.println(eq);
				boolean c=  a.equalsIgnoreCase(b);
				System.out.println(c);
				int com= a.compareTo(b);
				System.out.println(com);
				String A;
				String B;
				int cam= "A".compareTo("B");
				System.out.println(cam);
				char prvi= a.charAt(0);
				char zadnji= a.charAt(a.length()-1);
				System.out.println(prvi);
				System.out.println(zadnji);
				int prviCode = a.codePointAt(0);
				int zadnjiCode = a.codePointAt(a.length()-1);
				System.out.println(prviCode);
				System.out.println(zadnjiCode);
				int index= a.indexOf("d");
				System.out.println(index);
				String untrimmed="   test  ";
						String trimmed=untrimmed.trim();
						System.out.println(trimmed);
						String de = "Hello"+ " "+"world";
						System.out.println(de);
						
						
				
			
				
				
			
			
				
				
				

	}
}
 