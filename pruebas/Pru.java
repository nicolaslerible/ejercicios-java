
public class Pru {
	
	public static void main (String args[]) {
		
    String palabra="mec";
    System.out.println("1 o 2: ");
    int num = Integer.parseInt(System.console().readLine());
    if (num == 1){
      palabra="ola";
    }else{
      palabra="adios";
    }
    System.out.println(palabra);
    
	}
}

