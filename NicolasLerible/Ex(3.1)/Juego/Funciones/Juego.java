package Funciones;

public class Juego {
	
	public static boolean victoria (String jug, String ord){
		
    
    if(jug.equals("piedra")){
      if(ord.equals("tijeras")){
        return true;
      }else{
        return false;
      }
    }else if(jug.equals("papel")){
      if(ord.equals("piedra")){
        return true;
      }else{
        return false;
      }
    }else if(jug.equals("tijeras")){
      if(ord.equals("papel")){
        return true;
      }else{
        return false;
      }
    }else{
      System.out.print("Jugada no válida. ");
      return false;
    }
    
    
	}
}

