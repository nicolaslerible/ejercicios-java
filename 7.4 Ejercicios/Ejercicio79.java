
public class Ejercicio79 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int det = 0;
    int[] num = new int[8];
    for(i=0;i<8;i++){
      System.out.print("Dime un numero("+(i+1)+"):");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    for(i=0;i<8;i++){
      System.out.print(num[i]);
      det = num[i]%2;
      if (det==0){
        System.out.println(" par");
      }else{
        System.out.println(" impar");
      }
    }
	}
}

