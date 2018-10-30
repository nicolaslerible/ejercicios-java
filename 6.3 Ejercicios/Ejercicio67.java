
public class Ejercicio67 {
	
	public static void main (String args[]) {
		
    System.out.println("             tabla 1    tabla 2    tabla 3");
    for (int i=1;i<16;i++){
      int res = (int)(Math.random()*3);
      if (i<10){
        System.out.print("Partido "+i+"   ");
      }else{
        System.out.print("Partido "+i+"  ");
      }
      for (int j=0;j<3;j++){
        switch (res){
          case 0:
            System.out.print("| X - - |  ");
          break;
          case 1:
            System.out.print("| - X - |  ");
          break;
          case 2:
            System.out.print("| - - X |  ");
          break;
        }
      }
      System.out.println("");
    }
	}
}

