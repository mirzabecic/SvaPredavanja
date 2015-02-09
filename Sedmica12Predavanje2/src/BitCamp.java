import java.util.LinkedList;


public class BitCamp {
	private int studentNum = 22;
	LinkedList <Student> student;
	public BitCamp(){
		student = new LinkedList();
	}
	public String toXML(){
		
		String tmp = "<studentNum>" + studentNum + "</studentNum";
		for(Student s : student){
			tmp +="<student>" + s.toXML() + "</student>";
		}
		return tmp;
	}
	
}
