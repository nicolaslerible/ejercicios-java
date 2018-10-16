
public class Ejercicio530 {
	
	public static void main (String args[]) {
		
    String dia1;
    int hora1 = 0;
    String dia2;
    int hora2 = 0;
    int sol;
    int calculo1=1;
    int calculo2=0;
    
    System.out.print("introduce el primer dia: ");
    dia1 = System.console().readLine();
    System.out.print("introduce su hora: ");
    hora1 = Integer.parseInt(System.console().readLine());
    System.out.print("introduce el segundo dia: ");
    dia2 = System.console().readLine();
    System.out.print("introduce su hora: ");
    hora2 = Integer.parseInt(System.console().readLine());
    
      switch (dia1){
        
        case "lunes":
        case "1":
          calculo1 =0;
        break;
        
        case "martes":
        case "2":
          calculo1 =24;
        break;
        
        case "miercoles":
        case "3":
          calculo1 =48;
        break;
        
        case "jueves":
        case "4":
          calculo1 =72;
        break;
        
        case "viernes":
        case "5":
          calculo1 =96;
        break;
        
        case "sabado":
        case "6":
          calculo1 =120;
        break;
        
        case "domingo":
        case "7":
          calculo1 =144;
        break;
        default:
          System.out.println("Has introducido un dia incorrecto");
      }
    System.out.println(calculo1);
    
      switch (dia2){
        
        case "lunes":
        case "1":
          calculo2 =0;
        break;
        
        case "martes":
        case "2":
          calculo2 =24;
        break;
        
        case "miercoles":
        case "3":
          calculo2 =48;
        break;
        
        case "jueves":
        case "4":
          calculo2 =72;
        break;
        
        case "viernes":
        case "5":
          calculo2 =96;
        break;
        
        case "sabado":
        case "6":
          calculo2 =120;
        break;
        
        case "domingo":
        case "7":
          calculo2 =144;
        break;
        default:
          System.out.println("Has introducido un dia incorrecto");
      }
    
    sol = (calculo2+hora2)-(calculo1+hora1);
    System.out.println("entre las "+hora1+" del "+dia1+" y las "+hora2+" del "+dia2+" hay "+sol+" horas.");
	}
}

