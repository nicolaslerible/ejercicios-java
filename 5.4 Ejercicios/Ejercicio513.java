
public class Ejercicio513 {
	
	public static void main (String args[]) {
		
    int pos = 0;
    int neg = 0;
    int det = 0;
    System.out.println("Introduce diez numeros y determino cuantos son positivos y cuantos negativos");
    for (int i=0;i<=9;i++) {
      
      System.out.print("Introduce un numero: ");
      det = Integer.parseInt(System.console().readLine());
      if (det>0)  {
        pos++;
      }else if (det<0){
        neg++;
      }
    }
    System.out.println("Has introducido "+pos+" numeros positivos y "+neg+" numeros negativos");
	}
}

