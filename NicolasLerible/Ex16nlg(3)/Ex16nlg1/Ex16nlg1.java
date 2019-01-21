import Consola.Funciones;

public class Ex16nlg1 {
	
	public static void main (String args[]) {
		
    int paloin=0;
    int palofin=0;
    System.out.print("Con cuantos discos deseas jugar?: ");
    int discos = Integer.parseInt(System.console().readLine());
    int[][] espacio = new int[3][discos+1];
    Funciones.inicializaPostes(discos, espacio);
    do{
      Funciones.muestraTorres(discos, espacio);
      System.out.print("De que poste vas a coger un disco?: ");
      paloin=(Integer.parseInt(System.console().readLine()))-1;
      System.out.print("A que poste vas a mover el disco?: ");
      palofin=(Integer.parseInt(System.console().readLine()))-1;
      Funciones.intentaMover(paloin, palofin, espacio);
    }while(Funciones.checkHanoi(espacio, discos)==false);
    
    if(Funciones.checkHanoi(espacio, discos)){
      System.out.println("¡Enhorabuen! Has ganado");
    }
    
	}
}

