
public class Ejercicio710b {
	
	public static void main (String args[]) {
		
    char[][] p = new char[3][3];
    boolean d = false;
    int x = 0;
    int y = 0;
    for(x=0;x<3;x++){
      for(y=0;y<3;y++){
        p[x][y] = ' ';
      }
    }
    System.out.println("Turno de 'x'.");
    for(int i=0;i<9;i++){
      System.out.print("Introduce fila:");
      x = Integer.parseInt(System.console().readLine())-1;
      System.out.print("Introduce columna:");
      y = Integer.parseInt(System.console().readLine())-1;
      if(p[x][y] != ' '){
        System.out.println("Prueba otra posición.");
      }else if(d==false){
        System.out.println();
        System.out.println();
        p[x][y] = 'X';
        System.out.println("Turno de '0'.");
        d=true;
      }else if(d==true){
        System.out.println();
        System.out.println();
        p[x][y] = '0';
        System.out.println("Turno de 'X'.");
        d=false;
      }
      //Dibujo el tres en raya
      System.out.println(p[0][0]+"| "+p[0][1]+" |"+p[0][2]);
      System.out.println("─┼───┼─");
      System.out.println(p[1][0]+"| "+p[1][1]+" |"+p[1][2]);
      System.out.println("─┼───┼─");
      System.out.println(p[2][0]+"| "+p[2][1]+" |"+p[2][2]);
    }
    
	}
}

