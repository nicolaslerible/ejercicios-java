/*
 * @author Nicolás Lerible García
 * 
 * Juego del piedra, papel o tijeras en el que el jugador 
 * introducirá una de estas tres palabras (Ej. "piedra") y 
 * se comparará con el elegido por el ordenador.
 */

import Funciones.Juego;

public class PiPaTi {
	
	public static void main (String args[]) {
		
    int Pjug = 0;
    int Pord = 0;
    String[] consola = new String[3];
    consola[0] = "piedra";
    consola[1] = "papel";
    consola[2] = "tijeras";
    System.out.println("Juego del piedra, papel o tijeras en el que el jugador");
    System.out.println("introducirá una de estas tres palabras (Ej. 'piedra') y ");
    System.out.println("se comparará con el elegido por el ordenador. En caso de");
    System.out.println("no introducir bien la jugada se considerará como punto");
    System.out.println("para la máquina.");
    System.out.println();
    System.out.print("Cuantas partidas deseas jugar?: ");
    int partidas = Integer.parseInt(System.console().readLine());
    for(int i=0;i<partidas;i++){
      System.out.println();
      System.out.print("Elige jugada: ");
      String jugador = System.console().readLine();
      String contra = consola[(int)(Math.random()*3)];
      System.out.println(jugador+"--x--"+contra);
      if(!jugador.equals(contra)){
        if(Juego.victoria(jugador, contra)){
          Pjug++;
          System.out.println("Punto para el jugador.  ");
        }else{
          Pord++;
          System.out.println("Punto para la máquina.  ");
        }
      }else{
        System.out.println("Empate.  ");
      }
      System.out.println("jugador "+Pjug+"-"+Pord+" Máquina");
    }
    if(Pjug>Pord){
      System.out.println("Victoria para el jugador por "+(Pjug-Pord)+" puntos.");
    }else if(Pord>Pjug){
      System.out.println("Victoria para la máquina por "+(Pord-Pjug)+" puntos.");
    }else{
      System.out.println("Empate, no hay ganador.");
    }
    
    
    
    
	}
}

