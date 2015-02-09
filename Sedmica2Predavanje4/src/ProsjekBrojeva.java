
public class ProsjekBrojeva {
	public static void main(String[] args) {
		System.out.println("Unesite brojeve,kada zavrsite upisite -1");
		int sum = 0;
		int count = 0;
		int num= -1;
		do{
			num=TextIO.getInt();
			if(num!= -1){
				sum += num;
				count++;
				
			}
		}while(num != -1);
		System.out.printf("P : %.2f",((double)sum / count));
		
		
		
		
	}

}
