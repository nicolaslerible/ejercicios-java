
public class Ejercicio527 {
	
	public static void main (String args[]) {
		
    System.out.print("Dime un numero entero: ");
    int num = Integer.parseInt(System.console().readLine());
    int i = 0;
    int suma = 0;
    int cant = 0;
    for (i=3;i<=num;i=i+3) {
      System.out.print(i+" ");
      suma=suma+i;
      cant++;
      
    }
    System.out.println(" ");
    System.out.println("entre 1 y "+num+" hay "+cant+" multiplos de 3");
    System.out.println("la suma de estos mmultiplos es "+suma);
	}
}

