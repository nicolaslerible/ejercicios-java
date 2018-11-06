
public class Ejercicio73 {
	
	public static void main (String args[]) {
		
    int[] num = new int[10];
    int i = 0;
    for(i=0;i<10;i++){
      System.out.print("introduce un numero("+(i+1)+"): ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for(i=0;i<10;i++){
      int j = 9-i;
      System.out.print(num[j]);
    }
    System.out.println("");
	}
}

