import funciones.Juego;

public class TresEnRaya {
	
	public static void main (String args[]) {
		
    int x=0;
    int y=0;
    int con=1;
    
    // Inicializar tabla ////////////////////
    char[][] table = new char[3][3];
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        System.out.print("("+(i+1)+","+(j+1)+")");
        table[i][j] = ' ';
      }
      System.out.println();
    }
    do{
      System.out.print("("+Juego.participante(con)+") Introduce coordenada x: ");
      x=(Integer.parseInt(System.console().readLine()))-1;
      System.out.print("("+Juego.participante(con)+") Introduce coordenada y: ");
      y=(Integer.parseInt(System.console().readLine()))-1;
      if((x<3 && x>=0) && (y<3 && y>=0)){
        if(table[x][y] == ' '){
          table[x][y] = Juego.participante(con);
          con++;
        }else{
          System.out.println("Ya hay una ficha en esa casilla");
        }
      }else{
        System.out.println("Casilla no valida");
      }
      System.out.println(table[0][0]+"|"+table[0][1]+"|"+table[0][2]);
      System.out.println("─┼─┼─");
      System.out.println(table[1][0]+"|"+table[1][1]+"|"+table[1][2]);
      System.out.println("─┼─┼─");
      System.out.println(table[2][0]+"|"+table[2][1]+"|"+table[2][2]);
    }while (con<10 && !Juego.victoria(table, x, y));
    
    
    
    System.out.println("Victoria de '"+Juego.participante((con-1))+"' ¡Bien Jugado!");
    
    
    
    
    
	}
}

