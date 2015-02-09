
public class SabiranjeDvaBroja {
	public static double sum(double br1, double br2){
		double doubleSum = br1 + br2;
		return doubleSum;
	}
	public static int sum(int num1, int num2){
		int sum = num1 +2;
		return sum;
	}
     public static void main(String[] args) {
	int num1 = 1;
	int num2 = 2;
	int sum = sum(num1,num2);
	System.out.println("Sum: " + sum);
	double doubleSum= sum(0.3,0.4);
	System.out.println("doubleSum " +  doubleSum);
         }
		
	}


