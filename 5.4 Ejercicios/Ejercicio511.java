

public class Ejercicio511 {
	
	public static void main (String args[]) {
		
    int num;
    System.out.println("Dime un numero y calculo el cuadrado y el cubo de sus 5 siguientes numeros");
    System.out.print("Introduce el numero: ");
    num = Integer.parseInt(System.console().readLine());
    
    for (int i=0;i<=4;i++) {
      System.out.print(num+"  ");
      System.out.print(num*num+"  ");
      System.out.print(num*num*num+"  ");
      System.out.println(" ");
      num++;
    }
	}
}

