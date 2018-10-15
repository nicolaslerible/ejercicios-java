
public class Ejercicio47 {
	
	public static void main (String args[]) {
		
    System.out.println("Dame tres notas y calculo su media:");
    System.out.print("Nota 1: ");
    double n1 = Double.parseDouble(System.console().readLine());
    System.out.print("Nota 2: ");
    double n2 = Double.parseDouble(System.console().readLine());
    System.out.print("Nota 3: ");
    double n3 = Double.parseDouble(System.console().readLine());
    double media = (n1+n2+n3)/3;
    System.out.println("Tu media es de "+ media);
	}
}

