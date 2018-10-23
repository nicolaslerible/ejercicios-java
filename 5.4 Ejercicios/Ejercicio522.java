
public class Ejercicio522 {
	
	public static void main (String args[]) {
		
    int num = 1;
    int pri = 1;
    int sol = 0;
    int con = 0;
    System.out.println("Te muestro los numeros primos entre 2 y 100");
    for (num=1;num<=100;num++) {
      do {
        sol = num % pri;
        if (sol == 0) {
          con++;
        }
        if (con == 2) {
          System.out.println(num);
        }
        pri++;
      }while (pri<=num);
    }
	}
}

