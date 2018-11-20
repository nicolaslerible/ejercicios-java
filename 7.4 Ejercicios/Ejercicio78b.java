
public class Ejercicio78b {
	
	public static void main (String args[]) {
		
    char[] cor = new char[8];
    cor[0] = 'a';
    cor[1] = 'b';
    cor[2] = 'c';
    cor[3] = 'd';
    cor[4] = 'e';
    cor[5] = 'f';
    cor[6] = 'g';
    cor[7] = 'h';
    int j = 0;
    int i = 0;
    int n = 0;
    int[][] pos = new int[8][8];
    int col = 0;
    System.out.print("En que fila esta su alfil?(1-8): ");
    int fil = Integer.parseInt(System.console().readLine());
    System.out.print("En que columna esta su alfil?(a-h): ");
    String line = System.console().readLine();
    switch(line){
      case "a": 
        col = 1;
      break;
      case "b": 
        col = 2;
      break;
      case "c": 
        col = 3;
      break;
      case "d": 
        col = 4;
      break;
      case "e": 
        col = 5;
      break;
      case "f": 
        col = 6;
      break;
      case "g": 
        col = 7;
      break;
      case "h": 
        col = 8;
      break;
    } 
    do{
      n++;
      for(i=0;i<8;i++){
        for(j=0;j<8;j++)
        if(((i)==((fil-1)+n)) && ((j)==((col-1)+n))){
          System.out.print(cor[j]+""+(i+1)+" ");
        }else if(((i)==((fil-1)-n)) && ((j)==((col-1)+n))){
          System.out.print(cor[j]+""+(i+1)+" ");
        }else if(((i)==((fil-1)+n)) && ((j)==((col-1)-n))){
          System.out.print(cor[j]+""+(i+1)+" ");
        }else if(((i)==((fil-1)-n)) && ((j)==((col-1)-n))){
          System.out.print(cor[j]+""+(i+1)+" ");
        }
      }
    }while(n<8);
    System.out.println("");
	}
}

