
public class Examen4 {
	
	public static void main (String args[]) {
		
    int mes = 0;
    double sol = 0;
    double sum = 0;
    double din = 0;
    double ren = 0;
    double obj = 0;
    System.out.println("Suponiendo que la rentabilidad se aplica al final:");
    System.out.print("Cuanto dinero desea ingresar?: ");
    din = Integer.parseInt(System.console().readLine());
    System.out.print("Cual será el porcentaje de rentabilidad mensual?(0-100): ");
    ren = Integer.parseInt(System.console().readLine());
    System.out.print("Que cantidad desea alcanzar?: ");
    obj = Integer.parseInt(System.console().readLine());
    sum = din*(ren/100);
    sol = din;
    do {
      sol = sol+(sum);
      mes++; 
    }while (sol<obj);
    
    if (mes != 1) {
      System.out.println("Tardará "+mes+" meses en alcanzar el objetivo");
    }else {
      System.out.println("Tardará 1 mes en alcanzar el objetivo");
    }
	}
}

