
public class Ejercicio613 {
	
	public static void main (String args[]) {
		
    int da1 = 8;
    int da2 = 9;
    do{
      da1 = (int)(Math.random()*6+1);
      da2 = (int)(Math.random()*6+1);
      System.out.println("Dado 1: "+da1+"    Dado 2: "+da2);
    }while(da1 != da2);
    
    
	}
}

