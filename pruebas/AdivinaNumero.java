
public class AdivinaNumero {
	
	public static void main (String args[]) {
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
      }else if (num>adivina) {
        System.out.println("Prueba un numero mas bajo");
      }else if (num==adivina) {
        System.out.println("Enhorabuena, has adivinado el numero");
        i = 1;
      }
      
      
    }while (i<1);
    
    
	}
}

