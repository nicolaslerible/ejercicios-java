
public class Ejercicio66 {
	
	public static void main (String args[]) {
		
    int i = 5;
    int sol = 0;
    int num = 0;
    int adi = (int)(Math.random()*101);
    System.out.println(adi);
    System.out.println("Intenta adivinar el numero:");
    do {
      System.out.print("Tienes "+i+" intentos:"); 
      num = Integer.parseInt(System.console().readLine());
      if (num<adi){
        System.out.println("El numero a adivinar es mayor");
      }else if (num>adi){
        System.out.println("El numero a adivinar es menor");
      }else if (num==adi){
        System.out.println("Enhorabuena, has acertado");
        sol++;
      }
      i--;
    }while ((i != 0) && (sol==0));
    if (i==0){
      System.out.println("No te quedan mas intentos");
    }
	}
}

