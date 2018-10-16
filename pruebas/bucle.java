
public class bucle {
	
	public static void main (String args[]) {
		int LaVoluntad;
    System.out.println("Cuantos numeros quieres? ");
    String s = System.console().readLine();
    LaVoluntad = integr.parseint(s);
    for (int i=1; i <= LaVoluntad; i++){
      System.out.println(i);
    }
	}
}

