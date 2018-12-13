
public class Ejercicio712b {
	
	public static void main (String args[]) {
		
    int[][] num = new int[10][10];
    int i = 0;
    int j = 0;
    int max = 0;
    int sum = 0;
    int min = 999;
    for(i=0;i<9;i++){
      for(j=0;j<9;j++){
        num[i][j]= (int)(Math.random()*400+500);
      }
    }
    
    for(i=0;i<9;i++){
      for(j=0;j<9;j++){
        System.out.printf(" %4d", num[i][j]);
      }
      System.out.println();
    }
    System.out.println();
    for(i=0;i<9;i++){
      System.out.printf(" %4d", num[8-i][i]);
      if(num[i][i]<min){
        min = num[8-i][i];
      }else if(num[8-i][i]>max){
        max = num[8-i][i];
      }
      sum = sum+num[8-i][i];
    }
    System.out.println();
    System.out.print("max = "+max+"  min = "+min+"  media = "+(sum/10));
    System.out.println();
	}
}

