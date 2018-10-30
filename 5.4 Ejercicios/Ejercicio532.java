
public class Ejercicio532 {
	
	public static void main (String args[]) {
		
    long sum = 0;
    long dig = 0;
    long num = 0;
    long i = 0;
    System.out.print("introduce un numero: ");
    num = Integer.parseInt(System.console().readLine());
    for (i=1;i<num;i=i*10){
    }
    i=i / 10;
    do {
      dig = num / i;
      if ((dig%2)==0){
      System.out.print(dig+" ");
      sum = sum+dig;
      }
      num = num-(dig*i);
      i = i/10;
    }while (i>0);
    System.out.println("");
    System.out.println("la suma de estos numeros es: "+sum);
	}
}

