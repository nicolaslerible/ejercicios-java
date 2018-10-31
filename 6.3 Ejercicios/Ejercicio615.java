
public class Ejercicio615 {
	
	public static void main (String args[]) {
		
    int com = (int)(Math.random()*7+1);
    for(int i=0;i<com;i++){
      for(int j=0;j<4;j++){
        int nota = (int)(Math.random()*7+1);
        switch(nota){
          case 1:
            System.out.print("DO ");
          break;
          case 2:
            System.out.print("RE ");
          break;
          case 3:
            System.out.print("MI ");
          break;
          case 4:
            System.out.print("FA ");
          break;
          case 5:
            System.out.print("SOL ");
          break;
          case 6:
            System.out.print("LA ");
          break;
          case 7:
            System.out.print("SI ");
          break;
        }
      }
      System.out.print("| ");
    }
    System.out.println("| ");
	}
}

