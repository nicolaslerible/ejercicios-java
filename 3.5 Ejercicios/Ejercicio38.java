
public class Ejercicio38 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Cuantas horas has trabajado?");
    line = System.console().readLine();
    double horas;
    horas = Integer.parseInt(line);
    double gan;
    gan = horas * 12;
    System.out.println("Has ganado " + gan + "€");
    
	}
}

