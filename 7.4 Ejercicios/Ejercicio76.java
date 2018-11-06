
public class Ejercicio76 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[15];
    for(i=0;i<15;i++){
      System.out.print("Dime un numero("+(i+1)+"):");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.print(num[14]+" ");
    for (i=0;i<14;i++){
      System.out.print(num[i]+" ");
    }
    System.out.println("");
	}
}

