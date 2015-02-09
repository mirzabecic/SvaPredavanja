
public class josNovijiZadatak {
	public static boolean isEven(int num){
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter 2 integers");
		int num1 = TextIO.getInt();
		int num2 = TextIO.getInt();
		int sum = 0;
		for (int i = num1; i < num2;i++){
			if (isEven(i)==true){
				sum+=i;
			}
		}
		System.out.println("Suma je : " + sum);
	}
	
	

	}
