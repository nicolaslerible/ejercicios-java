
public class Ejercicio310 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Cuantos Mb tienes?");
    line = System.console().readLine();
    double mb;
    mb = Integer.parseInt(line);
    double kb = mb * 1024;
    System.out.println(mb + "Mb equivalen a " + kb + "Kb");
    
	}
}

