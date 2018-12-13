/*
 * @author Nicolás Lerible García 
 * 
 */ 
import funciones3.otros;

public class Examen3 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce un numero: ");
    long num = Integer.parseInt(System.console().readLine());
    if(otros.Curioseador(num)){
      System.out.println("El numero introducido es curioso.");
    }else{
      System.out.println("El numero introducido no es curioso.");
    }
	}
}

