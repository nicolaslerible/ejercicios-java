import Consola.Funciones;

public class Ex16nlg2 {
	
	public static void main (String args[]) {
		
    System.out.print("Cuantos numeros vas a introducir?: ");
    int cantidad = Integer.parseInt(System.console().readLine());
    int[] numero = new int[cantidad];
    Funciones.inicializar(numero, cantidad);
    int canti = Funciones.buscaSietes(cantidad, numero);
    int[] solucion = new int[canti];
    Funciones.rellenaSolucion(solucion, numero, cantidad);
    for(int i=0;i<canti;i++){
      System.out.print(solucion[i]+" ");
    }
	}
}

