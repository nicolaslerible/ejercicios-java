
public class Ejercicio517 {
	
	public static void main (String args[]) {
		
    System.out.print("Dime un numero entero y positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int sol = (num+(num+99))*50;
    if (num>0){
      System.out.println("la suma de los siguientes 100 numeros es: "+sol);
    }else {
      System.out.println("Has introducido un numero incorrecto");
    }
	}
}

