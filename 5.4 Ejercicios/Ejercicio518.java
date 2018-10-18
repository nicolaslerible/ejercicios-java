
public class Ejercicio518 {
	
	public static void main (String args[]) {
		
    int num1 = 0;
    int num2 = 0;
    System.out.println("Te digo cuantos numeros hay entre dos introducidos contando de 7 en 7");
    System.out.print("Introduce el primer numero: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo numero: ");
    num2 = Integer.parseInt(System.console().readLine());
    do {
      System.out.print(num1+" ");
      num1 = num1 + 7;
    }while (num1<=num2);
    System.out.println("");
	}
}

