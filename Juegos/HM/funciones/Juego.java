package funciones;

public class Juego {
	
	public static void generar (char[] palabra, int num) {
		
    for(int i=0;i<num;i++){
      palabra[i] = '_';
    }
  }
  public static void comprobar(char[] sol, char[] pre, char letra, int num){
    
    for(int i=0;i<num;i++){
      if(sol[i]==letra){
        pre[i]=letra;
      }
    }
    
  }
  
  
  
}

