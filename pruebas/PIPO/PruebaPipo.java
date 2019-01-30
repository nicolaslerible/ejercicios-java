
public class PruebaPipo {
	
	public static void main (String args[]) {
		
    Pipo perro = new Pipo();
    System.out.println("¿Que le pasará a Pipo?");
    System.out.println("1. Cantar");
    System.out.println("2. Ostia");
    System.out.println("3. Legia");
    do{
      System.out.print("Elección: ");
      int elec = Integer.parseInt(System.console().readLine());
      System.out.println();
      if(elec==1){
        perro.canta();
      }else if(elec==2){
        perro.ostia();
      }else if(elec==3){
        perro.legia();
      }else{
        System.out.println("Lo siento Pi-Po");
      }
    }while(0==0);
    
	}
}

