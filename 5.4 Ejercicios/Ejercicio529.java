
public class Ejercicio529 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce el rango de numeros: ");
    int ran = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    for (int i=0;i<=ran;i++) {
      if ((i%num) != 0) {
        System.out.print(i+" ");
      }
    }
    System.out.println("");
	}
}

