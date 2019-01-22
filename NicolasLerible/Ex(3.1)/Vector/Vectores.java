import Funciones.Juego;

public class Vectores {
	
	public static void main (String args[]) {
		
    int i=0;
    int j=0;
    int lon = 5;
    int[] vector = new int[lon];
    int[] apoyo = new int[lon];
    vector[0]=45;
    vector[1]=2;
    vector[2]=17;
    vector[3]=99;
    vector[4]=77;
    for(i=0;i<lon;i++){
      if(Juego.buscaSietes(vector[i])){
        apoyo[j]=vector[i];
        j++;
      }
    }
    for(i=0;i<lon;i++){
      if(!Juego.buscaSietes(vector[i])){
        apoyo[j]=vector[i];
        j++;
      }
    }
    for(i=0;i<lon;i++){
      vector[i]=apoyo[i];
      System.out.print(vector[i]+" ");
    }
    
	}
}

