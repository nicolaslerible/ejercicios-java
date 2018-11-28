
public class Funcion {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(System.console().readLine());
    
    if(par(n)){
      System.out.println(n+" es par");
    }else{
      System.out.println(n+" es impar");
    }
	}
  
  public static boolean par(int x){
    
    if((x%2)==0){
      return true;
    }
    return false;

  }
}

