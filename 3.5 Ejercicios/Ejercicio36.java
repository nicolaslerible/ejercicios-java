
public class Ejercicio36 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Cuanto mide su base?");
    line = System.console().readLine();
    double base;
    base = Integer.parseInt(line);
    
    System.out.println("¿Cuanto mide su altura?");
    line = System.console().readLine();
    double altura;
    altura = Integer.parseInt(line);
    double area = (base * altura) / 2;
    System.out.println("El área del triángulo es " + area );
    
	}
}

