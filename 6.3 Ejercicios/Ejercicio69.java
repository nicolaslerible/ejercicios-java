
public class Ejercicio69 {
	
	public static void main (String args[]) {
		
    int num = 0;
    int con = 0;
    do {
      num = 2*(int)(Math.random()*51);
      System.out.print(num+" ");
      con++;
    }while (num != 24);
    System.out.println("");
    System.out.println("Se han introducido "+con+" numeros.");
	}
}

