
public class Ejercicio531 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce la altura de la L: ");
    int alt = Integer.parseInt(System.console().readLine());
    int lar = alt/2;
    int i = 0;
    for (i=0;i<(alt-1);i++){
      System.out.println("*");
    }
    for (i=0;i<=lar;i++){
      System.out.print("* ");
    }
    System.out.println("");
	}
}

