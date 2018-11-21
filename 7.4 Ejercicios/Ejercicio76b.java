
public class Ejercicio76b {
	
	public static void main (String args[]) {
		
    boolean igu = false;
    int max = 0;
    int xmax = 0;
    int ymax = 0;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    boolean m = true;
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
        do{
          igu=false;
          num[i][j]= (int)(Math.random()*100);
          for(k=0;k<6;k++){
            for(l=0;l<6;l++){
              if (num[i][j]!=num[k][l]){
                igu = true;
              }
            }
          }
        }while(igu = false);
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

