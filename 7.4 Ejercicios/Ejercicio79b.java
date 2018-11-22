
public class Ejercicio79b {
	
	public static void main (String args[]) {
		
    int i = 0;
    int j = 0;
    int[][] num = new int[12][12];
    for(i=0;i<12;i++){
      for(j=0;j<12;j++){
      num[i][j] = (int)(Math.random()*100);
      }
    }
    System.out.println("Cuadro normal:");
    for(i=0;i<12;i++){
      for(j=0;j<12;j++){
      System.out.printf("%3d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println("Cuadro girado a la izquierda:");
    for(j=0;j<12;j++){
      for(i=11;i>=0;i--){
      System.out.printf("%3d", num[i][j]);
      }
      System.out.println();
    }
    
    
	}
}

