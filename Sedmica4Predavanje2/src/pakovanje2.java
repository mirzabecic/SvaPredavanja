
public class pakovanje2 {
	public static void main(String[] args) {
		
		for (int i =0; i<args.length;i++){
			if (args.length==0){
				System.out.println("Hello World");
			}else{
				System.out.printf("Hello %s\n", args[i]);
			}
		}
	}

}
