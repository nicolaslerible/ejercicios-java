
public class PruebaFiguras {
	
	public static void main (String args[]) {
		
    System.out.println("Calculo el area y el perimetro de una de las dos");
    System.out.println("figuras a introducir.");
    System.out.print("Quieres crear un cuadrado(1) o un triangulo(2): ");
    int ele = Integer.parseInt(System.console().readLine());
    if(ele==1){
      System.out.print("Introduce su lado: ");
      int lado = Integer.parseInt(System.console().readLine());
      Cuadrado c = new Cuadrado(lado);
      System.out.println(c.toString());
    }else if(ele==2){
      System.out.print("Introduce su base: ");
      int bas = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce su altura: ");
      int alt = Integer.parseInt(System.console().readLine());
      Triangulo t = new Triangulo(bas, alt);
      System.out.println(t.toString());
    }else{
      System.out.println();
    }
    System.out.println("Fin del juego");
	}
}

