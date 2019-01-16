package funciones;

public class Juego {
	
	public static boolean permitir (String s) {
    if(s.equals("pato")||s.equals("nada")||s.equals("trigo")||s.equals("zorro")){
      return true;
    }else{
     return false;
    }
	}
  
  public static void mover(char[][] pos, String s){
    int lugar = 0;
    if(pos[0][3]=='0'){
      pos[1][3]='0';
      pos[0][3]=' ';
      lugar = 1;
    }else{
      pos[1][3]=' ';
      pos[0][3]='0';
      lugar = 0;
    }
    if(!s.equals("nada")){
      arrastrar(pos, s, lugar);
    }
  }
  public static void arrastrar(char[][] pos, String s, int l){
    if(s.equals("pato")){
      pos[1][1]=' ';
      pos[0][1]=' ';
      pos[l][1]='p';
    }
    if(s.equals("trigo")){
      pos[1][0]=' ';
      pos[0][0]=' ';
      pos[l][0]='t';
    }
    if(s.equals("zorro")){
      pos[1][2]=' ';
      pos[0][2]=' ';
      pos[l][2]='z';
    }
  }
  public static int partida(char[][] pos){
    
    
    /*
    if(pos[0][3]==' '){
      if((pos[1][0]==pos[1][1])||(pos[1][1]==pos[1][2])){
        return 1;
      }
    }else if(pos[1][3]==' '){
      if((pos[0][0]==pos[0][1])||(pos[0][1]==pos[0][2])){
        return 1;
      }
    }else if((pos[0][0]==pos[0][1])&&(pos[0][0]==pos[0][2])){
      return 2;
    }
    */
    if((pos[0][0]==pos[0][1])&&(pos[0][0]==pos[0][2])){
      return 2;
    }else if(pos[0][3]==' '){
      if((pos[1][0]==pos[1][1])||(pos[1][1]==pos[1][2])){
        return 1;
      }
    }else if(pos[1][3]==' '){
      if((pos[0][0]==pos[0][1])||(pos[0][1]==pos[0][2])){
        return 1;
      }
    }
    
    return 0;
  } 
  
}

