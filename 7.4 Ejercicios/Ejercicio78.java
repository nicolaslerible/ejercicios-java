
public class Ejercicio78 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[12];
    System.out.println("Introduce las temperaturas media de los meses de un año:");
    for(i=0;i<12;i++){
      System.out.print("Mes "+(i+1)+": ");
      num[i] = Integer.parseInt(System.console().readLine()); 
    }
    for(i=0;i<12;i++){
      for(int j=0;j<num[i];j++){
        System.out.print("=");
      }
      System.out.println("");
    }
	}
}

