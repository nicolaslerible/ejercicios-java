
public class Ejercicio41 {
	
	public static void main (String args[]) {
		String asig;
    System.out.println("dime un dia de la semana y te responeré que tienes a primera hora");
    System.out.println("LUNES = 1");
    System.out.println("MARTES = 2");
    System.out.println("MIERCOLES = 3");
    System.out.println("JUEVES = 4");
    System.out.println("VIERNES =5");
    String numero = System.console().readLine();
    int dia = Integer.parseInt(numero);
    
      switch (dia) {
      case 1:
      asig = "Sistemas Informaticos";
      System.out.println("A primera hora tienes: " + asig);
      break;
      case 2:
      asig = "Programación";
      System.out.println("A primera hora tienes: " + asig);
      break;
      case 3:
      asig = "Entornos de desarrollo";
      System.out.println("A primera hora tienes: " + asig);
      break;
      case 4:
      asig = "Entornos de desarrollo";
      System.out.println("A primera hora tienes: " + asig);
      break;
      case 5:
      asig = "Sistemas Informaticos";
      System.out.println("A primera hora tienes: " + asig);

    }
	}
}

