import matematicas.varios;

public class Ejercicio817 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce un numero en binario:");
    long num = Integer.parseInt(System.console().readLine());
    num = varios.BinADec(num);
    System.out.print(num);
	}
}

