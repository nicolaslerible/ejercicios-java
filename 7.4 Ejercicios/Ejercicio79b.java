
public class Ejercicio79b {
	
	public static void main (String args[]) {
		
    int i = 0;
    int j = 0;
    int[][] num = new int[6][6];
    
    //Determino los valores
    for(i=0;i<6;i++){
      for(j=0;j<6;j++){
        num[i][j] = (int)(Math.random()*10);
      }
    }
    //Dibujo el cuadro
    for(i=0;i<6;i++){
      for(j=0;j<6;j++){
        System.out.printf(" %2d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    //Versión 3.3.1
    for(i=0;i<3;i++){
      for(j=0;j<=i;j++){
        System.out.printf(" %2d", num[i+1][j]);
      }
      for(j=0+i;j<5-i;j++){
      System.out.printf(" %2d", num[i][j]);
      }
      for(j=(i-1);j>=0;j--){
        System.out.printf(" %2d", num[i-1][5-j]);
      }
      System.out.println();
    }
    //Bucle inverso
    for(i=3;i>0;i--){
      if(i != 1){
      System.out.printf(" %2d", num[7-i][0]);
      }else{
        System.out.printf(" %2d", num[5][1]);
      }
      for(j=1;j<6-i;j++){
        System.out.printf(" %2d", num[6-i][j+1]);
      }
      for(j=(i-1);j>=0;j--){
        System.out.printf(" %2d", num[5-i][5-j]);
      }
      System.out.println();
    }
    
    
	}
}

