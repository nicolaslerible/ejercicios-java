
public class Interfaz {
	
	public static void main (String args[]) {
		
    int op =0;
    int h=0;
    int m=0;
    int s=0;
    Tiempo[] time = new Tiempo[2];
    
    for(int i=0;i<2;i++){
      System.out.println("Intervalo "+(i+1)+":");
      System.out.print("Introduce los segundos: ");
      s = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce los minutos: ");
      m = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce las horas: ");
      h = Integer.parseInt(System.console().readLine());
      if(s>=60){
        m+=s/60;
        s=s%60;
      }else if(m>=60){
        h+=m/60;
        m=m%60;
      }
      time[i] = new Tiempo(h,m,s);
    }
    
    do{
      System.out.println();
      System.out.println("Que operacion quieres realizar?");
      System.out.println("1.Sumar");
      System.out.println("2.Restar");
      System.out.println("3.Mostrar");
      System.out.println("4.Salir");
      System.out.print("Escribe un numero: ");
      op = Integer.parseInt(System.console().readLine());
      if(op==1){
        Tiempo.sumar(time[0],time[1]);
      }else if(op==2){
        Tiempo.restar(time[0],time[1]);
      }else if(op==3){
        System.out.println("Intervalo 1: "+time[0].toString());
        System.out.println("Intervalo 2: "+time[1].toString());
      }
    }while(op!=4);
    
    
	}
  
}

