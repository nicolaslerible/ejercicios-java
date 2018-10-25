
public class Ejercicio65 {
	
	public static void main (String args[]) {
		
    int num = (int)(Math.random()*100)+100;
    System.out.print(num+" ");
    int max = num;
    int min = num;
    int sum = 0;
    int med = 0;
    for (int i=0;i<49;i++) {
      num = (int)(Math.random()*100)+100;
      System.out.print(num+" ");
      sum = sum+num;
      if (num>max) {
        max = num;
      }else if (num<min) {
        min = num;
      }
    }
    med = sum/50;
    System.out.println("");
    System.out.println("El minimo es: "+min);
    System.out.println("El maximo es: "+max);
    System.out.println("La media de estos numeros es: "+med);
	}
}

