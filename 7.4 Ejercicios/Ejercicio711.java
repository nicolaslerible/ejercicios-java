
public class Ejercicio711 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[10];
    int[] pri = new int[10];
    int[] npri = new int[10];
    int j = 0;
    int det = 0;
    int con1 = 0;
    int n = 0;
    int m = 0;
    //Pido 10 numeros
    for (i=0;i<10;i++){
      System.out.print("Dime un numero: ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    // Escribo la primera tabla
    System.out.println("┌──────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│indice│   0 │   1 │   2 │   3 │   4 │   5 │   6 │   7 │   8 │   9 │");
    System.out.println("├──────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│valor ");
    for(i=0;i<10;i++){
      System.out.printf("|%4d ", num[i]);
    }
    System.out.println("│");
    System.out.println("└──────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    // Separo los primos de los no primos
    for(i=0;i<10;i++){
      con1 = 0;
      for (j=1;j<=num[i];j++){
        det = num[i]%j;
        if (det == 0){
          con1++;
        }
      }
      if ((con1 == 2) || (num[i]==1)){
        pri[n] = num[i];
        n++;
      }else{
        npri[m] = num[i];
        m++;
      }
    }
    // Muestro la segunda tabla
    System.out.println("┌──────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│indice│   0 │   1 │   2 │   3 │   4 │   5 │   6 │   7 │   8 │   9 │");
    System.out.println("├──────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│valor ");
    for(i=0;i<n;i++){
      System.out.printf("|%4d ", pri[i]);
    }
    for(i=0;i<m;i++){
      System.out.printf("|%4d ", npri[i]);
    }
    System.out.println("│");
    System.out.println("└──────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    // Salto de linea
    System.out.println("");
	}
}

