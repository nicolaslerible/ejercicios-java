
public class Ejercicio43 {
	
	public static void main (String args[]) {
		
    System.out.println("dime un numero y te respondo a que dia de la semana corresponde:");
    int dia = Integer.parseInt(System.console().readLine());
    switch (dia){
      case 1:
      System.out.println("1=lunes");
      break;
      case 2:
      System.out.println("2=martes");
      break;
      case 3:
      System.out.println("3=miercoles");
      break;
      case 4:
      System.out.println("4=jueves");
      break;
      case 5:
      System.out.println("5=viernes");
      break;
      case 6:
      System.out.println("6=sábado");
      break;
      case 7:
      System.out.println("7=domingo");
      break;
      default:
      System.out.println("Ese numero no se corresponde a ningun dia");
    }
	}
}

