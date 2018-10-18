
public class Ejercicio520 {
	
	public static void main (String args[]) {
		
    int h = 0;
    int can = 1;
    System.out.println("Dibujo una piramide de la altura que introduzca");
    System.out.print("Introduce la altura: ");
    h = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el caracter deseado: ");
    String s = System.console().readLine();
    for (int k=0;k<h;k++) {
      System.out.print(" ");
    }
    System.out.println(s);
    h = h-2;
    do {
      for (int i=0;i<=h;i++) {
      System.out.print(" ");
      }
      System.out.print(s);
      for (int j=0;j<can;j++) {
        System.out.print(" ");
        
      }
      System.out.print(s);
      System.out.println(" ");
      can = can+2;
      h--;
    }while (h>0);
    can = can+2;
    System.out.print(" ");
    for (int l=0;l<can;l++) {
      System.out.print(s);
    }
    System.out.println("");
	}
}

