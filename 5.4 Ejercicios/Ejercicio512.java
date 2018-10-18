
public class Ejercicio512 {
	
	public static void main (String args[]) {
		
    int can;
    int num1 = 0;
    int num2 = 1;
    int proc = 0;
    System.out.println("Te muestro los N primeros numeros de la serie de fibonacci");
    System.out.print("Introduce una cantidad: ");
    can = Integer.parseInt(System.console().readLine());
    System.out.print("0  ");
    System.out.print("1  ");
    for (int i=0;i<=can;i++) {
      proc = num1+num2;
      System.out.print(proc+"  ");
      num1 = num2;
      num2 = proc;
    }
	}
}

