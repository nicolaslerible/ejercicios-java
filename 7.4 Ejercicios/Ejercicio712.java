
public class Ejercicio712 {
	
	public static void main (String args[]) {
		
    int i = 0;
    int[] num = new int[10];
    int in = 0;
    int fi = 0;
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
    // Determino el inicio y el fin
    System.out.print("Dame un valor inicial: ");
    in = Integer.parseInt(System.console().readLine());
    System.out.print("Dame un valor inicial: ");
    fi = Integer.parseInt(System.console().readLine());
    //Muestro la segunda tabla
    System.out.println("┌──────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.println("│indice│   0 │   1 │   2 │   3 │   4 │   5 │   6 │   7 │   8 │   9 │");
    System.out.println("├──────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│valor ");
    System.out.printf("|%4d ", num[9]);
    for (i=0;i<9;i++){
      if (i != in){
        System.out.printf("|%4d ", num[i]);
        if (i == (fi-1)){
          System.out.printf("|%4d ",num[in]);
        }
      }
    }
    System.out.println("│");
    System.out.println("└──────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
    // Salto de línea
    System.out.println("");
	}
}

