
public class Ejercicio57 {
	
	public static void main (String args[]) {
		int num = 0;
    int contraseña =1234;
    System.out.println("tiene 4 intentos para introducir la contraseña de 4 cifras");
    int i=0;
    
    //introducir el codigo
    
    for (i=1;i<=4;i++) {
      System.out.print("introduce el codigo("+(5-i)+"): ");
      num = Integer.parseInt(System.console().readLine());
      if (num==contraseña) {
        System.out.println("la caja fuerte se ha abierto satisfactoriamente");
        i=4;
      }
    }
    
	}
}

