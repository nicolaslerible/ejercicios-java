package funciones;

public class Juego {
	
  public static void arbitro(int jug, int maq, int[] jugada){
    
    if(jugada[jug]==jugada[maq]){
      System.out.println("Empate");
    }else if(jugada[jug+1]==jugada[maq]){
      System.out.println("Gana el jugador");
    }else{
      System.out.println("Gana la maquina");
    }
    
  }
  public static String traductor(int num){
    switch(num){
      case 0:
        return "tijeras";
      case 1:
        return "papel";
      case 2:
        return "piedra";
      default:
        return "ola";
    }
  }
}

