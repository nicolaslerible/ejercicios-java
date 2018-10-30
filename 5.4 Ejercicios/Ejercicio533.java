
public class Ejercicio533 {
	
	public static void main (String args[]) {
		
    System.out.print("Dime la altura de la U:");
    int alt = Integer.parseInt(System.console().readLine());
    int lar = (alt/2)+1;
    for(int i=1;i<alt;i++){
      System.out.print("*");
      for (int j=1;j<=lar;j++){
        System.out.print(" ");
      }
      System.out.println("*");
    }
    System.out.print(" ");
      for (int j=1;j<=lar;j++){
        System.out.print("*");
      }
      System.out.println(" ");
	}
}

