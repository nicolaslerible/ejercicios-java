
public class Examen2 {
	
	public static void main (String args[]) {
		
    int alt = 0;
    int lar = 0;
    System.out.print("Introduce la altura del romboide(4-20): ");
    alt = Integer.parseInt(System.console().readLine());
    lar = alt;
    if ((alt<4) || (alt>20)){
      System.out.println("numero equivocado");
    }else {
      do {
        for (int i=0;i<=alt;i++){
        System.out.print(" ");
        }
        for (int i=0;i<lar;i++){
        System.out.print("*");
        }
        System.out.println("");
        alt--;
      }while (alt>0);
    }
	}
}

