
public class Ejercicio79b {
	
	public static void main (String args[]) {
		
    int i = 0;
    int j = 0;
    int[][] num = new int[12][12];
    
    //Determino los valores
    for(i=0;i<12;i++){
      for(j=0;j<12;j++){
        num[i][j] = (int)(Math.random()*100);
      }
    }
    //Dibujo el cuadro
    for(i=0;i<12;i++){
      for(j=0;j<12;j++){
        System.out.printf(" %2d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    //Versión 3.3.1
    for(i=0;i<6;i++){
      for(j=0;j<=i;j++){
        System.out.printf(" %2d", num[i+1][j]);
      }
      for(j=0+i;j<11-i;j++){
      System.out.printf(" %2d", num[i][j]);
      }
      for(j=(i-1);j>=0;j--){
        System.out.printf(" %2d", num[i-1][11-j]);
      }
      System.out.println();
    }
    //Bucle inverso
    for(i=6;i>0;i--){
      if(i != 1){
      System.out.printf(" %2d", num[13-i][0]);
      }else{
        System.out.printf(" %2d", num[11][1]);
      }
      for(j=1;j<12-i;j++){
        System.out.printf(" %2d", num[12-i][j+1]);
      }
      for(j=(i-1);j>=0;j--){
        System.out.printf(" %2d", num[11-i][11-j]);
      }
      System.out.println();
    }
    
    
	}
}

