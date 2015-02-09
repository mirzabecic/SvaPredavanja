
public class zadaca5 {
	public static void main(String[] args) {
		System.out.println("Unesi dvije rijeci");
		String var1= TextIO.getln();
		String var2=TextIO.getln();
		boolean tacno = true;
		if (var1.equals(var2)){
			System.out.println(tacno);
			
		}else{
			System.out.println(!tacno);
		}
		
	}

}
