
public class Ejercicio92 {
	
	public static void main (String args[]) {
		
    boolean salir=false;
    Coche coche1 = new Coche();
    Bicicleta bici1 = new Bicicleta();
    do{
      System.out.println();
      System.out.println("-----------Que deseas hacer?-----------");
      System.out.println("1. Andar con el coche.");
      System.out.println("2. Andar con la bicicleta.");
      System.out.println("3. Quemar rueda (coche).");
      System.out.println("4. Hacer el caballito (bicicleta).");
      System.out.println("5. Mostrar kilometraje del coche.");
      System.out.println("6. Mostrar kilometraje de la bicicleta.");
      System.out.println("7. Mostrar kilometraje total.");
      System.out.println("8. Salir");
      System.out.print("Introduce una acción(1-8): ");
      int accion = Integer.parseInt(System.console().readLine());
      System.out.println();
      switch (accion){
        case 1:
          coche1.andar();
        break;
        case 2:
          bici1.andar();
        break;
        case 3:
          coche1.quemar();
        break;
        case 4:
          bici1.caballito();
        break;
        case 5:
          System.out.println("Has recorrido "+coche1.getKmRecorridos()+" km con el coche.");
        break;
        case 6:
          System.out.println("Has recorrido "+bici1.getKmRecorridos()+" km con la bicicleta.");
        break;
        case 7:
          System.out.println("Has recorrido un total de "+(bici1.getKmRecorridos()+coche1.getKmRecorridos())+" Km.");
        break;
        case 8:
          salir=true;
        break;
      }
    }while(salir==false);
    
	}
}

