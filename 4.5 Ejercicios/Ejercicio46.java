
public class Ejercicio46 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduzca la altura a la que caerá el objeto: ");
    double altura = Integer.parseInt(System.console().readLine());
    double tiempo = Math.sqrt(2*altura/9.8);
    System.out.println("El objeto tardará " + tiempo + " segundos en caer");
	}
}

