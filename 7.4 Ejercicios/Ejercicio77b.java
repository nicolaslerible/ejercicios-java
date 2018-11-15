
public class Ejercicio77b {
	
	public static void main (String args[]) {
		
    int x = 0;
    int y = 0;
    int minx = 0;
    int miny = 0;
    int tesx = 0;
    int tesy = 0;
    int corx = 0;
    int cory = 0;
    int[][] esp = new int[5][5];
    //Defino aguas
    for(x=0;x<5;x++){
      for(y=0;y<5;y++){
        esp[x][y]=0;
      }
    }
    //Integro la mina
    minx = (int)(Math.random()*5);
    miny = (int)(Math.random()*5);
    esp[minx][miny]=1;
      //integro el tesoro
    do{
      tesx = (int)(Math.random()*5);
      tesy = (int)(Math.random()*5);
    }while((tesx == minx) && (tesy == miny));
    esp[tesx][tesy]=2;
    System.out.println("tesoro "+tesx+tesy);
    System.out.println("mina "+minx+miny);
    for(int i=0;i<6;i++){
      //pido cordenadas
      System.out.print("Introduce la coordenada x(0-4): ");
      corx = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la coordenada y(0-4): ");
      cory = Integer.parseInt(System.console().readLine());
      //compruebo resultado
      if((corx==tesx) && (cory==tesy)){
        System.out.println("Enhorabuena, ha encontrado el tesoro");
        i=6;
      }else if((corx==minx) && (cory==miny)){
        System.out.println("La mina ha explotado, ha perdido");
        i=6;
      }else if(((corx==(minx-1)) || (corx==(minx+1)) || (corx==minx)) && ((cory==(miny-1)) || (cory==(miny+1)) || (cory==miny))){
        System.out.println("Cuidado, hay una mina cerca");
      }
    }
    System.out.println("El juego ha finalizado");
	}
}

