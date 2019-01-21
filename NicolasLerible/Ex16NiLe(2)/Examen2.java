/*
 * @author Nicolás Lerible García 
 * 
 */ 
public class Examen2 {
	
	public static void main (String args[]) {
		
    int[] premiado = new int[13];
    int sol=0;
    int con=0;
    Ganadores(premiado);
    for(int i=0;i<13;i++){
      System.out.print(premiado[i]+" ");
    }
    System.out.println("");
    do{
      System.out.print("¿Que numero desea consultar?: ");
      con = Integer.parseInt(System.console().readLine());
      sol = Consulta(con, premiado);
      switch(sol){
        case 0:
          System.out.println("Has ganado el primer premio");
        break;
        case 1:
          System.out.println("Has ganado el segundo premio");
        break;
        case 2:
          System.out.println("Has ganado el tercer premio");
        break;
        case 4:
          System.out.println("Has ganado una pedrea");
        break;
        case 5:
          System.out.println("Has ganado un reintegro");
        break;
        case 6:
          System.out.println("Tu boleto no ha recivido ningun premio");
        break;
      }
      
    }while(con != 0);
	}
  
  public static void Ganadores (int[] num){
    int d = 0;
    int c = 0;
    for(int i=0;i<13;i++){
      do{
        c = 0;
        d = (int)(Math.random()*9998+1);
        for(int j=0;j<13;j++){
          if(d==num[j]){
            c++;
          }
        }
      }while(c != 0);
      num[i] = d;
    }
  }
  public static int Consulta (int con, int[] pre){
    int i=0;
    int c=0;
    c=0;
    for(i=0;i<3;i++){
      if(con==pre[i]){
        c=1;
        return i;
      }
    }
    for(i=0;i<10;i++){
      if(con==pre[i]){
        c=1;
        return 4;
      }
    }
    if((((con%10)==(pre[0]%10)) || ((con/1000)==(pre[0]%10))) && (c==0)){
      return 5;
    }else{
      return 6;
    }
  }
}

