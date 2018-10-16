
public class AdivinaNumero4 {
	
	public static void main (String args[]) {
		
    boolean okmin = false;
    boolean okmax = false;
    int min=0;
    int max=0;
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
        if (okmin==false) {
          okmin = true;
          min=num; 
        }else if (min<num) {
          min = num;
        }
      }else if (num>adivina) {
        System.out.println("Prueba un numero mas bajo");
        if (okmax==false) {
          okmax = true;
          max=num; 
        }else if (max>num) {
          min = num;
        }
      }else if (num==adivina) {
        System.out.println("Enhorabuena, has adivinado el numero");
        i = 1;
      }
      if ((max!=adivina) && (min!=adivina)) {
        System.out.println("El numero a adivinar esta entre "+min+" y "+max);
      }
    }while (i<1);
	}
}

