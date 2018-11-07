
public class Ejercicio713 {
	
	public static void main (String args[]) {
		
    int max = 0;
    int min = 500;
    int i = 0;
    int det = 0;
    int[] num = new int[100];
    for(i=0;i<100;i++){
      num[i] = (int)(Math.random()*500);
      System.out.print(num[i]+" ");
      if (num[i]<min){
        min = num[i];
      }else if(num[i]>max){
        max = num[i];
      }
    }
    System.out.println("");
    System.out.print("Que quieres destacar? (1-minimo, 2-maximo): ");
    det = Integer.parseInt(System.console().readLine());
    for(i=0;i<100;i++){
      if ((det==1) && (num[i]==min)){
        System.out.print("**"+num[i]+"** ");
      }else if ((det==2) && (num[i]==max)){
        System.out.print("**"+num[i]+"** ");
      }else{
        System.out.print(num[i]+" ");
      }
    }
    System.out.println("");
	}
}

