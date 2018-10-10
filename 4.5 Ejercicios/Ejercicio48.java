
public class Ejercicio48 {
	
	public static void main (String args[]) {
		
    System.out.print("nota de tu 1º examen: ");
    double n1 = Integer.parseInt(System.console().readLine());
    System.out.print("nota de tu 2º examen: ");
    double n2 = Integer.parseInt(System.console().readLine());
    System.out.print("nota de tu 3º examen: ");
    double n3 = Integer.parseInt(System.console().readLine());
    double media = (n1+n2+n3)/3;
    System.out.println("Has sacado un " + media);
    if (media>10) {
      System.out.println("has introducido mal los datos");
    }else if (media>8) {
      System.out.println("Sobreasliente");
    }else if (media>6) {
      System.out.println("Notable");
    }else if (media>4) {
      System.out.println("Bien");
    }else if (media>2) {
      System.out.println("Suficiente");
    }else {
      System.out.println("Insuficiente");
    }
	}
}

