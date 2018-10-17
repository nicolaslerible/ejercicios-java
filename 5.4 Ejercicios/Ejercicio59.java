
public class Ejercicio59 {
	
	public static void main (String args[]) {
		
    System.out.println("te digo cuantas cifras tiene el numero que introduzca");
    System.out.print("introduce un numero: ");
    int num = Integer.parseInt(System.console().readLine());
    int i =1;
    int dig = 10;
    while (num>=dig) {
      i++;
      dig = dig*10;
    }
    System.out.println("El numero tiene "+i+" digitos");
	}
}

