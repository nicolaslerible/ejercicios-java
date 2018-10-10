
public class Ejercicio42 {
	
	public static void main (String args[]) {
		System.out.println("dame una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    String frase;
    if (((hora >=0) && (hora <=6)) || (hora >=22)) {
      System.out.println("Buenas noches");
    }
    if ((hora >=7) && (hora<=12)){
      System.out.println("buenos dias");
    }
    if ((hora >=13) && (hora <=21)){
      System.out.println("Buenas tardes");
    }
  }
}

