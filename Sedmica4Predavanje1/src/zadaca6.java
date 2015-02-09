
public class zadaca6 {
	public static void main(String[] args) {
		String nextWord= TextIO.getln();
		String nextSentence= TextIO.getln();
		if (nextSentence.contains(nextWord)){
			System.out.println("First half of the alphabet");
		}else{
			System.out.println("Second half of the alphabet");
		}
	}

}
