import funciones.Juego;

public class Ahorcado {
	
	public static void main (String args[]) {
		
    int vidas = 5;
    char intento;
    System.out.print("Introduce una palabra: ");
    String sol = System.console().readLine();
    int lon = (sol.length());
    char[] letraSol = sol.toCharArray();
    char[] letraPre = new char[lon];
    Juego.generar(letraPre, lon);
    do{
      for(int i=0;i<lon;i++){
      System.out.print(letraPre[i]+" ");
      }
      System.out.println();
      System.out.print("Introduce una letra: ");
      intento = (System.console().readLine()).charAt(0);
      Juego.comprobar(letraSol, letraPre, intento, lon);
      
    }while(intento != '+');
    
    
    
    
    
    
	}
}

