
public class Ejercicio49 {
	
	public static void main (String args[]) {
		
    System.out.println("resuelvo ecuaciones de segundo grado");
    System.out.println("dame un valor para a: ");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("dame un valor para b: ");
    int b = Integer.parseInt(System.console().readLine());
    System.out.println("dame un valor para c: ");
    int c = Integer.parseInt(System.console().readLine());
    double sol1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
    double sol2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
    System.out.print("Las soluciones a esta ecuacion son "+sol1+" y "+sol2);
	}
}

