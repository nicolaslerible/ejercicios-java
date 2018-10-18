
public class Ejercicio516 {
	
	public static void main (String args[]) {
		
    int num = 0;
    int pri = 1;
    int sol = 0;
    int con = 0;
    System.out.println("Te digo si un numero introducido es primo o no");
    System.out.print("Introduce un numero: ");
    num = Integer.parseInt(System.console().readLine());
    do {
      sol = num % pri;
      if (sol == 0) {
        con++;
      }
      pri++;
    }while (pri <= num);
    if (con == 2) {
      System.out.println("El numero introducido es primo");
    }else {
      System.out.println("El numero introducido no es primo");
    }
    
	}
}

