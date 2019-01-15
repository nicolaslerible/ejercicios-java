package funciones;

public class Juego {
	
  public static String solucion(){
    return "Hola";
  }
  public static char participante(int con){
    if(0 == con%2){
      return '0';
    }else{
      return 'x';
    }
    
  }
  public static boolean victoria(char[][] table, int x, int y){
    
    if(((table[x][0]==table[x][1])&&(table[x][0]==table[x][2]))||((table[0][y]==table[1][y])&&(table[0][y]==table[2][y]))){
      return true;
    }else if(((table[0][0]==table[1][1])&&(table[0][0]==table[2][2]))&&(x==y)){
      return true;
      }else if(((table[2][0]==table[1][1])&&(table[2][0]==table[0][2]))&&(2==(x+y))){
      return true;
    }else{
      return false;
    }
    
  }
}

