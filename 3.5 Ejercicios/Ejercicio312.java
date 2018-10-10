
public class Ejercicio312 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Que nota sacaste en el primer examen?");
    line = System.console().readLine();
    double nota;
    nota = 0.4 * Integer.parseInt(line);
    System.out.println("¿Que nota quieres sacar en el trimestre?");
    line = System.console().readLine();
    double tri;
    tri = 0.6 * Integer.parseInt(line);
    double nota2;
    nota2 = 2 * tri - nota;
    System.out.println("En el segundo examen debes sacar un " + nota2);
    
	}
}

