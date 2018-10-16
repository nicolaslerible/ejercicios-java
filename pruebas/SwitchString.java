
public class SwitchString {
	
	public static void main (String args[]) {
		String dia;
    System.out.print("escribe 'lunes': ");
    dia = System.console().readLine();
    switch (dia){
      case "lunes":
        System.out.println("enhorabuena");
      break;
      default:
        System.out.println("error");
    }
	}
}

