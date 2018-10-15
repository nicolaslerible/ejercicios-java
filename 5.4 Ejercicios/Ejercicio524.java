
public class Ejercicio524 {
	
	public static void main (String args[]) {
		
    System.out.print("dime un numero: ");
    int fila=Integer.parseInt(System.console().readLine());
    int altura=1;
    int j;
    
    for (int i=0 ; i<fila ; i++) {
      
      for (j=0;j<(fila-i);j++) {
        System.out.print(" ");
      }
      
      for (j=1;j<=i;j++) {
        System.out.print(j);
      }
      for (j=altura;j>=1;j--) {
        System.out.print(j);
      }
      System.out.println(" ");
      altura++;
      
    }
    
	}
}

