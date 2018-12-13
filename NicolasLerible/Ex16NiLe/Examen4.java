/*
 * @author Nicolás Lerible García 
 * 
 */ 
public class Examen4 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int det;
    int[] num = new int[101];
    do{
      System.out.print("Introduce un número: ");
      det = Integer.parseInt(System.console().readLine());
      if((det>=1) && (det<=100)){
        num[det]++;
      }else if (det != -1){
        System.out.println("Has introducido un numero incorrecto, este no se registrará.");
      }
    }while(det != -1);
    for(i=0;i<100;i++){
      if(num[i] != 0){
        System.out.print(i+": ");
        for(int j=0;j<num[i];j++){
          System.out.print("*");
        }
        System.out.println();
      }
      
    }
	}
}

