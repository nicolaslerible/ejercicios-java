
public class Ejercicio523 {
	
	public static void main (String args[]) {
		
    int con = 0;
    int num = 0;
    int sum = 0;
    int med = 0;
    do {
      System.out.print("Dime un numero: ");
      num = Integer.parseInt(System.console().readLine());
      sum = sum+num;
      con++;
    }while (sum<=10000);
    med = sum/con;
    System.out.println("has introducido "+con+" numeros.");
    System.out.println("la suma de estos numeros es "+sum);
    System.out.println("y la media de estos numeros es "+med);
	}
}

