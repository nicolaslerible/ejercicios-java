
public class Ejercicio711b {
	
	public static void main (String args[]) {
		
    int[][] num = new int[10][10];
    int i = 0;
    int j = 0;
    int max = 0;
    int sum = 0;
    int min = 400;
    for(i=0;i<10;i++){
      for(j=0;j<10;j++){
        num[i][j]= (int)(Math.random()*100+200);
      }
    }
    
    for(i=0;i<10;i++){
      for(j=0;j<10;j++){
        System.out.printf(" %4d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    for(i=0;i<10;i++){
      System.out.printf(" %4d", num[i][i]);
      if(num[i][i]<min){
        min = num[i][i];
      }else if(num[i][i]>max){
        max = num[i][i];
      }
      sum = sum+num[i][i];
    }
    System.out.println();
    System.out.print("max = "+max+"  min = "+min+"  media = "+(sum/10));
    System.out.println();
	}
}

