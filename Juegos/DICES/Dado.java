
public class Dado {
	
	public static void main (String args[]) {
		
    int num=0;
    String respuesta = "si";
    do{
      System.out.print("Tirar dado?: ");
      respuesta = System.console().readLine();
      if(respuesta.equals("si")){
        num = (int)(Math.random()*6+1);
        System.out.println("┌───┐");
        System.out.println("│ "+num+" │");
        System.out.println("└───┘");
      }
    }while(respuesta.equals("si"));
    
    
    
	}
}

