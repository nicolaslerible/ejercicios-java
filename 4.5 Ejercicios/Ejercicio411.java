
public class Ejercicio411 {
	
	public static void main (String args[]) {
		
    System.out.print("Dime que hora es(HORAS): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Dime cuantos minutos lleva esa hora(MINUTOS): ");
    int min = Integer.parseInt(System.console().readLine());
    double t = (24-hora)*3200 + (60-min)*60;
    System.out.print("Quedan " + t + " segundos para media noche.");
    
	}
}

