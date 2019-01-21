package Consola;

public class Funciones {
	
	public static void inicializar(int[] numero, int cantidad) {
		
    for(int i=0;i<cantidad;i++){
      System.out.print("Introduce un numero: ");
      numero[i]=Integer.parseInt(System.console().readLine());
    }
	}
  public static int buscaSietes(int cantidad, int[] numero){
    boolean parar=false;
    int heroe=0;
    int contador=0;
    for(int i=0;i<cantidad;i++){
      heroe=numero[i];
      do{
        if(numero[i]%10==7){
          contador++;
          parar=true;
        }
        numero[i]=numero[i]/10;
      }while((numero[i]!=0)&&(parar==false));
      parar=true;
      numero[i]=heroe;
    }
    return contador;
  }
  public static void rellenaSolucion(int[] solucion, int[] numero, int cantidad){
    boolean parar=false;
    int heroe;
    int j=0;
    for(int i=0;i<cantidad;i++){
      heroe=numero[i];
      do{
        if(numero[i]%10==7){
          solucion[j]=heroe;
          j++;
          parar=true;
        }
        numero[i]=numero[i]/10;
      }while((numero[i]!=0)&&(parar==false));
      numero[i]=heroe;
    }
  }
  
}

