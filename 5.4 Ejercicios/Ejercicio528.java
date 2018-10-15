
public class Ejercicio528 {
	
	public static void main (String args[]) {
		
    System.out.print("Dime un numero y calculo su factorial: ");
    int cant = Integer.parseInt(System.console().readLine());
    int i=1;
    int fact=1;
    for (i=1;i<=cant;i++) {
      fact = fact*i;
    }
    System.out.println(cant+"! = "+fact);
	}
}

