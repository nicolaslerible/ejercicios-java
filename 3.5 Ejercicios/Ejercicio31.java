
public class Ejercicio31 {
	
	public static void main (String args[]) {
    String line;
    System.out.println("Dime un número: ");
    line = System.console().readLine();
		double x;
    x = Integer.parseInt(line);
    System.out.println("Dime otro número: ");
    line = System.console().readLine();
    double y;
    y = Integer.parseInt(line);
    double sol;
    sol = x * y;
    System.out.println("Su multiplicación es: " + sol);
	}
}

