
public class Ejercicio510 {
	
	public static void main (String args[]) {
		
    System.out.println("Calculo la media de los numeros introducidos");
    int num = 0;
    int suma = 0;
    double med = 0;
    int i = -1;
    do {
      System.out.print("dime un numero: ");
      num = Integer.parseInt(System.console().readLine());
      suma = suma+num;
      i++;
    }while (num>=0);
    suma = suma-num;
    med = suma / i;
    System.out.println("la media de estos numeros es "+med);
    
	}
}

