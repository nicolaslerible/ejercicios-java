
public class Ejercicio72b {
	
	public static void main (String args[]) {
		
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
        System.out.print("introduce un numero: ");
        num[j][i] = Integer.parseInt(System.console().readLine());
      }
    }
    //Muestro todos los números
    System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┐");
    for(j=0;j<4;j++){
      for(i=0;i<5;i++){
        System.out.printf("|%4d ", num[j][i]);
        sum1 = sum1 + num[j][i];
      }
      System.out.printf("|%4d |", sum1);
      System.out.println("");
      System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┤");
      sum2=sum2+sum1;
      sum1=0;
    }
    for(i=0;i<5;i++){
      for(j=0;j<4;j++){
        sum3 = sum3 + num[j][i];
      }
      System.out.printf("|%4d ", sum3);
      sum4 = sum4 + sum3;
      sum3 = 0;
    }
    System.out.printf("|%4d |", sum4+sum2);
    System.out.println("");
    System.out.println("└─────┴─────┴─────┴─────┴─────┴─────┘");
	}
}

