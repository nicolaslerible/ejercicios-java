
public class pruebaF {
	
	public static void main (String args[]) {
		
    int det = 0;
    int i = 0;
    int[] num = new int[10];
    for(i=0;i<10;i++){
      System.out.print("Introduce un numero("+(i+1)+"): ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println("|indice |   1|   2|   3|   4|   5|   6|   7|   8|   9|  10|");
    System.out.print("| valor ");
    for(i=0;i<10;i++){
      System.out.printf("|%4d", num[i]);
    }
    System.out.println("|");
    System.out.println("*");
    System.out.println("|indice |   1|   2|   3|   4|   5|   6|   7|   8|   9|  10|");
    System.out.print("| valor ");
    for(i=0;i<10;i++){
      det = num[i]
      if()
      System.out.printf("|%4d", num[i]);
	}
}

