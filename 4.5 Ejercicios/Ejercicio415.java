
public class Ejercicio415 {
	
	public static void main (String args[]) {
		String s;
    System.out.println("De que simbolo desea que este compuesta la pirámide?");
    System.out.print("Simbolo: ");
    s = System.console().readLine();
    
    System.out.println("¿Hacia que dirección desea que mire su pirámide?");
    System.out.println("Arriba [1]");
    System.out.println("Abajo [2]");
    System.out.println("Izquierda [3]");
    System.out.println("derecha [4]");
    System.out.print("Dirección: ");
    int dir = Integer.parseInt(System.console().readLine());
    switch (dir) {
      case 1:
      System.out.println("     "+s);
      System.out.println("    "+s+s+s);
      System.out.println("   "+s+s+s+s+s);
      System.out.println("  "+s+s+s+s+s+s+s);
      System.out.println(" "+s+s+s+s+s+s+s+s+s);
      break;
      case 2:
      System.out.println(" "+s+s+s+s+s+s+s+s+s);
      System.out.println("  "+s+s+s+s+s+s+s);
      System.out.println("   "+s+s+s+s+s);
      System.out.println("    "+s+s+s);
      System.out.println("     "+s);
      break;
      case 3:
      System.out.println("      "+s);
      System.out.println("    "+s+s+s);
      System.out.println("  "+s+s+s+s+s);
      System.out.println(""+s+s+s+s+s+s+s);
      System.out.println("  "+s+s+s+s+s);
      System.out.println("    "+s+s+s);
      System.out.println("      "+s);
      break;
      case 4:
      System.out.println(s);
      System.out.println(s+s+s);
      System.out.println(s+s+s+s+s);
      System.out.println(s+s+s+s+s+s+s+s);
      System.out.println(s+s+s+s+s);
      System.out.println(s+s+s);
      System.out.println(s);
      break;
      default:
      System.out.println("prube de nuevo");
      
    }
    
	}
}

