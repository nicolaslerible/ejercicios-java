
public class Ejercicio63 {
	
	public static void main (String args[]) {
		
    int palo=(int)(Math.random()*4);
    int carta=(int)(Math.random()*10);
    switch(carta) {
      case 0:
        System.out.print("As ");
      break;
      case 1:
        System.out.print("2 ");
      break;
      case 2:
        System.out.print("3 ");
      break;
      case 3:
        System.out.print("4 ");
      break;
      case 4:
        System.out.print("5 ");
      break;
      case 5:
        System.out.print("6 ");
      break;
      case 6:
        System.out.print("7 ");
      break;
      case 7:
        System.out.print("Sota ");
      break;
      case 8:
        System.out.print("Caballo ");
      break;
      case 9:
        System.out.print("Rey ");
      break;
    }
    switch(palo) {
      case 0:
        System.out.println("de espadas");
      break;
      case 1:
        System.out.println("de porras");
      break;
      case 2:
        System.out.println("de copas");
      break;
      case 3:
        System.out.println("de monedas");
      break;
    }
	}
}

