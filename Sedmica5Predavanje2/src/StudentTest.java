
public class StudentTest {
	public static void main(String[] args) {
		Student [] s1=nizImena(5);
		redanje (s1);
		ispisStudenata(s1);
	 Student s3= new Student ();
	 s3.ime="mrko";
	 s3.prezime="brkic";
	 s3.brIndexa=4;
	 
	Student s4=new Student ();
	s4.ime="brko";
	s4.prezime="mrkic";
	s4.brIndexa=5;
	 
	Student s5=new Student ();
	s5.ime="sda";
	s5.prezime="sdp";
	s5.brIndexa=1;
	s3.ime=s4.ime;
	s3.prezime=s4.prezime;
	s3.brIndexa=s4.brIndexa;
	 
	
		
		
	}
	public static void ispisStudenata(Student[] s){
		for (int i =0;i<5;i++){
		System.out.printf("Ime: %s \nPrezime: %s" + "\nIndex: %s \nBrStud : %d",s[i].ime,s[i].prezime,s[i].brIndexa,s[i].brojStudenata);
		System.out.println();
	}
	}
	public static Student [] nizImena(int velicina){
		Student  [] niz = new Student  [velicina];
		for (int i=0;i<niz.length;i++){
		niz [i]= new Student();
		niz[i].ime="Ime";
		niz [i].prezime="Prezime";
		niz[i].brojStudenata++;
		niz[i].brIndexa=randomBroj();
	
	}
		return niz;
	}
	public static int randomBroj (){
		
	int randomBroj=(int)(Math.random()*100);
	System.out.println(randomBroj);
	return randomBroj;
		
	}
	 public static Student[] redanje (Student [] arr)
     {
    	
    				for (int i =0;i<arr.length;i++)
    				{
    					for (int j = i+1;j<arr.length;j++)
    					{
    						if(arr[i].brIndexa>arr[j].brIndexa){
    							
    						
    							int temp =arr[j].brIndexa;
    							arr[j].brIndexa= arr[i].brIndexa;
    							arr[i].brIndexa= temp;
    						}
    				}
    			}
    	 return arr;
     }
	 
	 
	
}
