
public class Ejercicio32 {
	
	public static void main (String args[]) {
    String line;
		System.out.println("¿Cuantos euros tienes?:");
    line = System.console().readLine();
    double euros;
    euros = Integer.parseInt(line);
    double sol;
    sol = euros * 166.386;
		System.out.println(euros + " euros equivalen a " + sol + " pesetas");
    
	}
}

