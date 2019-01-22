package Funciones;

public class Juego {
	
	public static boolean buscaSietes(int num) {
		
    do{
      if(num%10==7){
        return true;
      }
      num=num/10;
    }while(num!=0);
    return false;
	}
  public static boolean antiSietes(int num) {
    
    do{
      if(num%10==7){
        return true;
      }
      num=num/10;
    }while(num!=0);
    return false;
    
  }
}

