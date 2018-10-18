
public class Ejercicio514 {
	
	public static void main (String args[]) {
		
    double base = 0;
    double exp = 0;
    double pot = 1;
    System.out.print("Introduce una base: ");
    base = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce un exponente: ");
    exp = Integer.parseInt(System.console().readLine());
    for (int i=0;i<exp;i++) {
      pot = pot*base;
    }
    System.out.println("La potencia de "+base+" elevado a "+exp+" es igual a "+pot);
	}
}

