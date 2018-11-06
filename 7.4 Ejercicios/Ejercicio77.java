
public class Ejercicio77 {
	
	public static void main (String args[]) {
		
    int[] num = new int[100];
    int val1 = 0;
    int val2 = 0;
    int i = 0;
    for(i=0;i<100;i++){
      num[i] = (int)(Math.random()*21);
      System.out.print(num[i]+"  ");
    }
    System.out.println("");
    System.out.print("Introduce un valor(0-20): ");
    val1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce otro valor(0-20): ");
    val2 = Integer.parseInt(System.console().readLine());
    System.out.println("Las ocurrencias del primer valor se cambiaran por las del segundo");
    for (i=0;i<100;i++){
      if (num[i]==val1){
        System.out.print("'"+val2+"'  ");
      }else {
        System.out.print(num[i]+"  ");
      }
    }
    System.out.println("");
	}
}

