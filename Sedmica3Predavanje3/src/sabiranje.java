
public class sabiranje {
	public static void main(String[] args) {
		int a =10;
		int b =20;
		int rez = zbir(a,b);
		System.out.println(rez);
		ispisiZbir(a,b);
		int [] niz1 = new int [3];
		niz1[0] = 12;
		niz1[1] = 1;
		niz1 [2] = 23;
		int zbir1 =zbirBrojevaUNizu(niz1);
		System.out.println(zbir1);
		int [] niz100 = new int [100];
		for (int i=0;i<niz100.length; i++){
			niz100[i]=i+1;
		}
		System.out.println(zbirBrojevaUNizu(niz100));
		System.out.println(zbirBrojevaUNizu(new int [] {1,2,3,4,5 }));
 	}
      public static int zbir(int i1,int i2){
    	  return i1 +i2;
    	  
      }
      public static int zbirBrojevaUNizu(int[]brojevi){
    	  int suma = 0;
    	  for (int broj : brojevi){
    		  suma +=broj;
    	  }
    			  return suma;
      }
public static void ispisiZbir (int i1, int i2){
	System.out.println(i1 + i2);
}
}
