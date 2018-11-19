
public class Ejercicio71b {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[][] num = new int[3][6];
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┐");
    for(i=0;i<6;i++){
      if((i==0) || (i==1) || (i==2) || (i==5)){
        System.out.printf("|%4d ", num[0][i]);
      }else{
        System.out.print("|     ");
      }
    } 
    System.out.println("|");
    System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┤");
    for(i=0;i<6;i++){
      if((i==0) || (i==4)){
        System.out.printf("|%4d ", num[1][i]);
      }else{
        System.out.print("|     ");
      }
    }
    System.out.println("|"); 
    System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┤");
    for(i=0;i<6;i++){
      if((i==2) || (i==3) || (i==5)){
        System.out.printf("|%4d ", num[0][i]);
      }else{
        System.out.print("|     ");
      }
    } 
    System.out.println("|");
    System.out.println("└─────┴─────┴─────┴─────┴─────┴─────┘");
	}
}

