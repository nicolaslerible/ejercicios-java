
public class Ejercicio45 {
	
	public static void main (String args[]) {
		
    System.out.println("Este programa resuelve ecuaciones del tipo ax + b = 0");
    System.out.print("Introduzca un valor para a: ");
    double a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca un valor para b: ");
    double b = Integer.parseInt(System.console().readLine());
    double x = -b/a;
    System.out.println("el valor de x = " + x);
    
	}
}

