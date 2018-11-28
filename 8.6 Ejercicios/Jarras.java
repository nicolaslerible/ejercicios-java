
public class Jarras {
	
	public static void main (String args[]) {
		
    int[] jarra1 = new int[2];
    jarra1[0]=5;
    int[] jarra2 = new int[2];
    jarra2[0]=7;
    int jarra = 0;
    int op = 0;
    
    do{
      
      System.out.print("Que jarra va a usar?: ");
      jarra = Integer.parseInt(System.console().readLine());
      System.out.print("Que operación realizará?: ");
      op = Integer.parseInt(System.console().readLine());
      
      if(op==1){
        if(jarra==1){
          llenar(jarra1);
        }else{
          llenar(jarra2);
        }
      }
      if(op==2){
        if(jarra==1){
          vaciar(jarra1);
        }else{
          vaciar(jarra2);
        }
      }
      if(op==3){
        if(jarra==1){
          tras(jarra1, jarra2);
        }else{
          tras(jarra2, jarra1);
        }
      }
      System.out.println(jarra1[1]+"  "+jarra2[1]);
    }while(op>0);
    
	}
  
  public static void llenar(int[] jarra){
    jarra[1]=jarra[0];
  }
  
  public static void vaciar(int[] jarra){
    jarra[1]=0;
  }
  
  public static void tras(int[] jar1, int[] jar2){
    jar2[1] = jar2[1]+jar1[1];
    if(jar2[1]>jar2[0]){
      jar1[1] = jar2[1]-jar2[0];
      jar2[1] = jar2[0];
    }else{
      jar1[1] = 0;
    }
    
  }
}

