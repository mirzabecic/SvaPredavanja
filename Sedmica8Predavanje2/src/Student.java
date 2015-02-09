public class Student {
	private String name;
	private int numInd;
	private double gpa;

	public Student(String name, int numInd, double gpa) {
		this.name = name;
		this.numInd = numInd;
		this.gpa = gpa;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumInd() {
		return numInd;
	}

	public void setNumInd(int numInd) {
		this.numInd = numInd;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
	public String toString (){
		return name +gpa + numInd;
	}
	public  int compareTo(Student other){
		if (this.gpa > other.gpa){
			return 1;
		}else if(this.gpa < other.gpa){
			return -1;
		}else if (this.gpa == other.gpa){
			if (this.numInd > other.numInd){
				return 1;
			}else if (this.numInd > other.numInd){
				return -1;
			}else if (this.numInd == other.numInd){
				return this.name.compareTo(other.name);
			}
		}
		return 0;	
	}

}
