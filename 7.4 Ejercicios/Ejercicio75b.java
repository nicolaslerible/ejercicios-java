
public class Ejercicio75b {
	
	public static void main (String args[]) {
		int max = 0;
    int xmax = 0;
    int ymax = 0;
    int i = 0;
    int j = 0;
    int[][] num = new int[6][10];
    System.out.println("┌──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┬──────┐");
    System.out.print("|      ");
    for(i=0;i<10;i++){
      System.out.print("|    "+i+" ");
    }
    System.out.println("|");
    for(i=0;i<6;i++){
      System.out.println("├──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┼──────┤");
      System.out.print("|    "+i+" ");
      for(j=0;j<10;j++){
        num[i][j]= (int)(Math.random()*1001);
        if(num[i][j]>max){
         max = num[i][j];
         xmax = i;
         ymax = j;
        }
       System.out.printf("|%5d ", num[i][j]); 
      }
      System.out.println("|");
    }
    System.out.println("└──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┴──────┘");
    System.out.println("El numero maximo se encuantra en la fila "+xmax+", columna "+ymax+".");
    
    
	}
}

