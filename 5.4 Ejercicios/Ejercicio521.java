
public class Ejercicio521 {
	
	public static void main (String args[]) {
		System.out.println("cuento los numeros que introduzcas, te digo el mayor de los pares y calculo la media de los impares :D");
    int det = 0;
    int suma = -1;
    double division = 0;
    int max = 2;
    int conj = 0;
    double med = 0;
    int suco = 0;
    do {
      System.out.print("Dime un numero: ");
      det = Integer.parseInt(System.console().readLine());
      division = det % 2;
      
      if ((division==0)&&(det>max)){
        max = det;
      }
      if (division>0) {
        conj=conj+det;
        suco++;
      }
      suma++;
    }while (det>=0);
    med = conj/suco;
    System.out.println("Has nombrado "+suma+" numeros");
    System.out.println("El mayor de los numeros pares es el "+max);
    System.out.println("la media de los impares es: "+med);
	}
}

