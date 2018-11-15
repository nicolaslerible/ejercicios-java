
public class Ejercicio715 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int det = 0;
    int fin = 0;
    int mesa = 0;
    int[] num = new int[10];
    //Determino los ocupantes de cada mesa
    for(i=0;i<10;i++){
      num[i] = (int)(Math.random()*5);
    }
    do{
      //Dibujo la tabla de mesas
      System.out.println("┌───────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
      System.out.println("│Nº de mesa │  1 │  2 │  3 │  4 │  5 │  6 │  7 │  8 │  9 │ 10 │");
      System.out.println("├───────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
      System.out.print("│Ocupación  ");
      for(i=0;i<10;i++){
        System.out.printf("|%4d", num[i]);
      }
      System.out.println("|");
      System.out.println("└───────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
      //Determino el numero de clientes
      System.out.print("¿Cuantos son?(introduzca -1 para salir del programa): ");
      det = Integer.parseInt(System.console().readLine());
      //Busco lugar para los clientes
      if(det>4){
        System.out.println("Lo siento, no admitimos grupos de "+det+", haga grupos de 4 personas como máximo e intente de nuevo.");
        i=0;
      }else{
        do{
          mesa = num[i]+det;
          if((num[i]==0) && (det>(-1))){
            System.out.println("Por favor, sientanse en la mesa "+(i+1));
            num[i] = mesa;
            fin++;
          }
          i++;
        }while((fin == 0) && (i<10));
        do{
          if((mesa<=4) && (det>(-1))){
            System.out.println("Tendrán que compartir mesa. Por favor, sientanse en la mesa "+(i+1));
            num[i] = mesa;
            fin++;
          }
          i++;
        }while((fin == 0) && (i<10));
        fin = 0;
      }
    }while(det != -1);
	}
}

