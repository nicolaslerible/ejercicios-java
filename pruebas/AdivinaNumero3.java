
public class AdivinaNumero3 {
	
	public static void main (String args[]) {
		
    int min = 0;
    int max = 0;
    int adivina = 0;
    System.out.print("Dime un numero entero a adivinar: ");
    adivina = Integer.parseInt(System.console().readLine());
    int num;
    int i = 0;
    do {
      System.out.print("Prueba un numero: ");
      num = Integer.parseInt(System.console().readLine());
      if (num<adivina) {
        System.out.println("Prueba un numero mas alto");
        if (num>min) {
          min = num;
        }
      }else if (num>adivina) {
        System.out.println("Prueba un numero mas bajo");
        if (num>max) {
          max = num;
        }
      }else if (num==adivina) {
        System.out.println("Enhorabuena, has adivinado el numero");
        i = 1;
      }
      if ((max>0) && (min>0)) {
        System.out.println("El numero a adivinar esta entre "+min+" y "+max);
      }
      
    }while (i<1);
    
    
    
	}
}

