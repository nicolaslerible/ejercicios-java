
public class Ejercicio611 {
	
	public static void main (String args[]) {
		
    int sus = 0;
    int suf = 0;
    int bie = 0;
    int not = 0;
    int sob = 0;
    for(int i=0;i<20;i++){
      int nota = (int)(Math.random()*5);
      switch (nota){
        case 0:
          System.out.println("suspenso ");
          sus++;
        break;
        case 1:
          System.out.println("suficiente ");
          suf++;
        break;
        case 2:
          System.out.println("bien ");
          bie++;
        break;
        case 3:
          System.out.println("notable ");
          not++;
        break;
        case 4:
          System.out.println("sobresaliente ");
          sob++;
        break;
      }
    }
  System.out.println("suspensos: "+sus+"  suficientes: "+suf);
  System.out.println("bienes: "+bie+"  notables: "+not+"  sobresalientes: "+sob);
	}
}

