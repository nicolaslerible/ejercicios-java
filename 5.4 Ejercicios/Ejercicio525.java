
public class Ejercicio525 {
	
	public static void main (String args[]) {
		
    int sum = 1;
    int num = 0;
    int dig = 0;
    System.out.print("Introduce un numero y lo escribo al revés: ");
    num = Integer.parseInt(System.console().readLine());
    do {
      dig = num%10;
      sum = dig;
      num = num/10;
      System.out.print(sum);
    }while (num != 0);
    
	}
}

