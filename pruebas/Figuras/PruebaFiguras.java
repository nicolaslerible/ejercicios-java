import java.util.ArrayList;

public class PruebaFiguras {
	
	public static void main (String args[]) {
		
    int ele;
    int lado;
    int bas;
    int alt;
    String nombre;
    ArrayList<Figuras> a = new ArrayList<Figuras>();
    System.out.println("Calculo el area y el perimetro de una de las dos");
    System.out.println("figuras a introducir.");
    do{
      System.out.print("Quieres crear un cuadrado(1) o un triangulo(2): ");
      ele = Integer.parseInt(System.console().readLine());
      if(ele==1){
        System.out.print("Introduce su nombre: ");
        nombre = System.console().readLine();
        System.out.print("Introduce su lado: ");
        lado = Integer.parseInt(System.console().readLine());
        a.add(new Cuadrado(lado, nombre));
      }else if(ele==2){
        System.out.print("Introduce su nombre: ");
        nombre = System.console().readLine();
        System.out.print("Introduce su base: ");
        bas = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce su altura: ");
        alt = Integer.parseInt(System.console().readLine());
        a.add(new Triangulo(bas, alt, nombre));
      }else{
        System.out.println();
      }
    }while(ele!=0);
    for(int i=0;i<a.size();i++){
      System.out.println(a.get(i));
    }
    System.out.println("Fin del juego");
	}
}

