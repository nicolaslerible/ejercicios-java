
public class Ejercicio710 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[20];
    int det;
    for(i=0;i<20;i++){
      num[i] = (int)(Math.random()*100);
      det = num[i]%2;
      if (det==0){
        System.out.print(num[i]+" ");
      }
    }
    for(i=0;i<20;i++){
      det = num[i]%2;
      if (det != 0){
        System.out.print(num[i]+" ");
      }
    }
    System.out.println("");
	}
}

