
public class Ejercicio526 {
	
	public static void main (String args[]) {
		
    int sum = 1;
    int cif = 0;
    int con = 0;
    int i = 0;
    int num = 0;
    int dig = 0;
    System.out.print("Dime un numero: ");
    num = Integer.parseInt(System.console().readLine());
    System.out.print("Dime un digito: ");
    dig = Integer.parseInt(System.console().readLine());
    for (i=1;i<=num;i=i*10){
      con++;
    }
    System.out.println("El digito introducido se corresponde con:");
    do {
      cif = num%10;
      if (cif==dig) {
      System.out.println("El "+sum+"º dígito");
      }
      num = num/10;
      sum++;
    }while(sum <= con);
	}
}

