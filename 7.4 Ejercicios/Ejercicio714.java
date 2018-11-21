
public class Ejercicio714 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int j = 0;
    int con = 0;
    String[] pal = new String[8];
    String[] col = new String[9];
    col[0] = "rojo";
    col[1] = "naranja";
    col[2] = "marron";
    col[3] = "amarillo";
    col[4] = "verde";
    col[5] = "azul";
    col[6] = "morado";
    col[7] = "blanco";
    col[8] = "negro";
    System.out.println("Recojo ocho palabras y pongo primero las que son colores.");
    System.out.println("colores validos-> rojo, naranja, amarillo, verde, marron, azul, morado, blanco y negro");
    for(i=0;i<8;i++){
      System.out.print("Introduce una palabra: ");
      pal[i] = System.console().readLine();
    }
    System.out.println("┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
    for(i=0;i<8;i++){
      System.out.printf("|%6d  ", i);
    }
    System.out.println("|");
    System.out.println("├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
    for(i=0;i<8;i++){
      for(j=0;j<8;j++){
        if(pal[i].equals(col[j])){
          System.out.printf("|%8s", pal[i]);
        }
      }
    }
    for(i=0;i<8;i++){
      con=0;
      for(j=0;j<8;j++){
        if(pal[i].equals(col[j])){
          con++;
        }
      }
      if(con==0){
        System.out.printf("|%8s", pal[i]);
      }
    }
    System.out.println("|");
    System.out.println("└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    
    
	}
}

