package Consola;

public class Funciones {
	
	public static void inicializaPostes (int discos, int[][] espacio) {
		
    espacio[0][0]=discos;
    for(int i=0;i<(discos);i++){
      espacio[0][i+1]=discos-i;
    }
	}
  public static void muestraTorres(int discos, int[][] espacio){
    for(int i=discos;i>0;i--){
      System.out.println(espacio[0][i]+"    "+espacio[1][i]+"    "+espacio[2][i]);
    }
    
  }
  public static void intentaMover(int paloin, int palofin, int[][] espacio){
    if(espacio[palofin][0]==0){
      espacio[palofin][1] = espacio[paloin][espacio[paloin][0]];
      espacio[paloin][espacio[paloin][0]]=0;
      espacio[paloin][0]=espacio[paloin][0]-1;
      espacio[palofin][0]=espacio[palofin][0]+1;
    }else if(espacio[palofin][espacio[palofin][0]]>espacio[paloin][espacio[paloin][0]]){
      espacio[palofin][espacio[palofin][0]+1]=espacio[paloin][espacio[paloin][0]];
      espacio[paloin][espacio[paloin][0]]=0;
      espacio[paloin][0]=espacio[paloin][0]-1;
      espacio[palofin][0]=espacio[palofin][0]+1;
    }else{
      System.out.println("Movimiento no válido");
    }
    
  }
  public static boolean checkHanoi(int[][] espacio, int discos){
    if(espacio[2][0]==discos){
      return true;
    }else{
      return false;
    }
    
  }
  
}

