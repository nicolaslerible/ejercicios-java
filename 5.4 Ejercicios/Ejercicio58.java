
public class Ejercicio58 {
	
	public static void main (String args[]) {
		
    int num = 0;
    System.out.print("Dime un numero y muestro su tabla de multiplicar: ");
    num = Integer.parseInt(System.console().readLine());
    for (int i=0;i<=10;i++) {
      System.out.println(num+" x "+i+" = "+num*i);
    }
	}
}

