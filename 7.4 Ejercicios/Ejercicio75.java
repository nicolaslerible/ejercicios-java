
public class Ejercicio75 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[10];
    int max = 0;
    int co1 = 0;
    int co2 = 0;
    int min = 10;
    for(i=0;i<10;i++){
      System.out.print("Introduce un numero("+(i+1)+"): ");
      num[i] = Integer.parseInt(System.console().readLine());
      if(num[i]>max){
        max = num[i];
        co1 = i;
      }else if(num[i]<min){
        min = num[i];
        co2= i;
      }
    }
    for (i=0;i<10;i++){
      System.out.print(num[i]);
      if (i==co1){
        System.out.println("  maximo");
      }else if (i==co2){
        System.out.println("  minimo");
      }else{
        System.out.println("");
      }
    }
	}
}

