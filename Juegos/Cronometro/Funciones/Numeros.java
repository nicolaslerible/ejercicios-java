package Funciones;

public class Numeros {
	
	public static void muestraNumero(int num, int capa) {
		
    switch(num){
      case 0:
        if((capa==0)||(capa==4)){
          System.out.print("XXXX ");
        }else{
          System.out.print("X  X ");
        }
      break;
      case 1:
        System.out.print("   X ");
      break;
      case 2:
        if(capa==1){
          System.out.print("   X ");
        }else if(capa==3){
          System.out.print("X    ");
        }else{
          System.out.print("XXXX ");
        }
      break;
      case 3:
        if((capa==1)||(capa==3)){
          System.out.print("   X ");
        }else{
          System.out.print("XXXX ");
        }
      break;
      case 4:
        if(capa==2){
          System.out.print("XXXX ");
        }else if((capa==0)||(capa==1)){
          System.out.print("X  X ");
        }else{
          System.out.print("   X ");
        }
      break;
      case 5:
        if(capa==1){
          System.out.print("X    ");
        }else if(capa==3){
          System.out.print("   X ");
        }else{
          System.out.print("XXXX ");
        }
      break;
      case 6:
        if(capa==1){
          System.out.print("X    ");
        }else if(capa==3){
          System.out.print("X  X ");
        }else{
          System.out.print("XXXX ");
        }
      break;
      case 7:
        if(capa==0){
          System.out.print("XXXX ");
        }else{
          System.out.print("   X ");
        }
      break;
      case 8:
        if((capa==1)||(capa==3)){
          System.out.print("X  X ");
        }else{
          System.out.print("XXXX ");
        }
      break;
      case 9:
        if(capa==1){
          System.out.print("X  X ");
        }else if(capa==3){
          System.out.print("   X ");
        }else{
          System.out.print("XXXX ");
        }
      break;
    }
    
	}
  
}

