public class Ejercicio39 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Cuanto mide el radio de su base?");
    line = System.console().readLine();
    double radio;
    radio = Integer.parseInt(line);
    
    System.out.println("¿Cuanto mide su altura?");
    line = System.console().readLine();
    double altura;
    altura = Integer.parseInt(line);
    double vol = 0.333 * 3.14 * radio * radio * altura;
    System.out.println("El Volumen del cono es " + vol );
    
	}
}

