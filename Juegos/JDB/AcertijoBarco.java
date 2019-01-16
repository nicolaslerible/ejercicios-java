import funciones.Juego;

public class AcertijoBarco {
	
	public static void main (String args[]) {
		
    int game=0;
    String sol;
    char[][] posibilidad = new char[2][4];
    for(int i=0;i<2;i++){
      for(int j=0;j<4;j++){
        posibilidad[i][j] = ' ';
      }
    }
    posibilidad[0][0] = 't';
    posibilidad[0][1] = 'p';
    posibilidad[0][2] = 'z';
    posibilidad[0][3] = '0';
    
    do{
      System.out.println("  |     |  ");
      System.out.println(posibilidad[0][0]+" |     | "+posibilidad[1][0]);
      System.out.println(posibilidad[0][1]+" |"+posibilidad[0][3]+"   "+posibilidad[1][3]+"| "+posibilidad[1][1]);
      System.out.println(posibilidad[0][2]+" |     | "+posibilidad[1][2]);
      System.out.println("  |     |  ");
      System.out.print("Que quieres mover?: ");
      sol = System.console().readLine();
      if(Juego.permitir(sol)){
        Juego.mover(posibilidad, sol);
        game=Juego.partida(posibilidad);
        System.out.println(game);
      }else{
        System.out.println("Movimiento no permitido");
      }
    }while(game==0);
    
    if(game==1){
      System.out.println("Has perdido");
    }else if(game==2){
      System.out.println("Has ganado");
    }
    
	}
}

