import Funciones.Numeros;

public class Reloj {
	
	public static void main (String args[]) throws InterruptedException {
		int capa=0;
    int seg1=0;
    int seg2=0;
    
    int min1=0;
    int min2=0;
    do{
      for(capa=0;capa<5;capa++){
        Numeros.muestraNumero(min2, capa);
        Numeros.muestraNumero(min1, capa);
        if((capa==1)||(capa==3)){
          System.out.print(" X  ");
        }else{
          System.out.print("    ");
        }
        Numeros.muestraNumero(seg2, capa);
        Numeros.muestraNumero(seg1, capa);
        System.out.println();
      }
      System.out.println();
      seg1++;
      if(seg1==10){
        seg1=0;
        seg2++;
        if(seg2==6){
          seg2=0;
          min1++;
          if(min1==10){
            min1=0;
            min2++;
          }
        }
      }
      Thread.sleep(1000);
    }while(min2==0);
    
    
    
	}
}

