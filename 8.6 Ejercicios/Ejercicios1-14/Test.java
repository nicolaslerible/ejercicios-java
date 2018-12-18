import matematicas.varios;

public class Test {
	
	public static void main (String args[]) {
		
    int sol = 0;
    int num1 = 0;
    int num2 = 0;
    System.out.print("numero1: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.print("numero2: ");
    num2 = Integer.parseInt(System.console().readLine());
    sol = varios.JuntaNumeros(num1, num2);
    System.out.println(sol);
	}
}

