import funciones.Juego;

public class PiPaTi {
	
	public static void main (String args[]) {
		
    int jugador=0;
    int con=0;
    int[] jugada = new int[4];
    jugada[0]=0;
    jugada[1]=1;
    jugada[2]=2;
    jugada[3]=0;
    do{
      System.out.print("Introduce una jugada: ");
      String mano = System.console().readLine();
      switch(mano){
        case "tijeras":
          jugador=0;
          break;
        case "papel":
          jugador=1;
          break;
        case "piedra":
          jugador=2;
          break;
        default:
          jugador=8;
        break;
      }
      int maquina = (int)(Math.random()*3);
      if(jugador!=8){
        System.out.println(mano+"--x--"+Juego.traductor(maquina));
        Juego.arbitro(jugador, maquina, jugada);
        con++;
      }else{
        System.out.println("La jugada no es valida");
      }
      
    }while (con<5);
    
	}
}

