
public class Ejercicio610 {
	
	public static void main (String args[]) {
		
    String dib="*";
    for (int i=0;i<10;i++){
      int can = (int)(Math.random()*40)+1;
      int car = (int)(Math.random()*6);
      switch (car){
        case 0:
          dib = "*";
        break;
        case 1:
          dib = "-";
        break;
        case 2:
          dib = "=";
        break;
        case 3:
          dib = ",";
        break;
        case 4:
          dib = "|";
        break;
        case 5:
          dib = "@";
        break;
      }
      for (int j=0;j<can;j++){
        System.out.print(dib);
      }
      System.out.println("");
    }
	}
}

