import Funciones.Numeros;

public class Mostrador {
	
	public static void main (String args[]) throws InterruptedException{
		
    int num=0;
    do{
      for(int i=0;i<5;i++){
      Numeros.muestraNumero(num, i);
      }
      num++;
      if(num==10){
        num=0;
      }
      Thread.sleep(1000);
    }while(0==0);
    
    
	}
}

