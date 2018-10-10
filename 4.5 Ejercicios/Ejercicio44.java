
public class Ejercicio44 {
	
	public static void main (String args[]) {
		
    System.out.println("Introduzca el numero de horas trabajadas esta semana");
    double horas = Integer.parseInt(System.console().readLine());
    double din; 
    if (horas <=40){
      din = horas * 12;
    } else {
        din = 480 + 16 * (horas - 40);
    }
    System.out.println("Tu salario semanal es de " + din + "€");
	}
}

