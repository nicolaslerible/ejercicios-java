
public class Ejercicio311 {
	
	public static void main (String args[]) {
		String line;
    System.out.println("¿Cuantos Kb tienes?");
    line = System.console().readLine();
    double kb;
    kb = Integer.parseInt(line);
    double mb = kb / 1024;
    System.out.println(kb + "Kb equivalen a " + mb + "Mb");
    
	}
}

