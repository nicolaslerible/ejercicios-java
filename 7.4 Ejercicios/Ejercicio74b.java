
public class Ejercicio74b {
	
	public static void main (String args[])
    throws InterruptedException{
		
    int i = 0;
    int j = 0;
    int k = 0;
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int sum4 = 0;
    int[][] num = new int[4][5];
      //Obtengo todos los números
      for(j=0;j<4;j++){
        for(i=0;i<5;i++){
          num[j][i] = (int)(Math.random()*900+100);
        }
      }
      //Muestro todos los números
      System.out.println("┌──────┬──────┬──────┬──────┬──────┬──────┐");
      for(j=0;j<4;j++){
        for(i=0;i<5;i++){
          System.out.printf("|%5d ", num[j][i]);
          sum1 = sum1 + num[j][i];
        }
        Thread.sleep(500);
        System.out.printf("|%5d |", sum1);
        System.out.println("");
        System.out.println("├──────┼──────┼──────┼──────┼──────┼──────┤");
        sum2=sum2+sum1;
        sum1=0;
      }
      for(i=0;i<5;i++){
        for(j=0;j<4;j++){
          sum3 = sum3 + num[j][i];
        }
        Thread.sleep(500);
        System.out.printf("|%5d ", sum3);
        sum4 = sum4 + sum3;
        sum3 = 0;
      }
      System.out.printf("|%5d |", sum4);
      System.out.println("");
      System.out.println("└──────┴──────┴──────┴──────┴──────┴──────┘");
    
  }
}

