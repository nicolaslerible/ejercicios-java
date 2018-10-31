
public class Ejercicio614 {
	
	public static void main (String args[]) {
		
    int fal = 0;
    int max = 100;
    int min = 0;
    int num = 1;
    int sol = 0;
    String res="oof";
    String det="ofo";
    System.out.println("Voy a intentar adivinar el numero en el que estas pensando");
    do{
      num = (int)(Math.random()*(max-min)+min);
      System.out.print("Estas pensando en el "+num+"?[si/no]: ");
      res = (System.console().readLine());
      switch (res) {
        case "si":
          System.out.println("¡He acertado!");
          sol++;
        break;
        case "no":
          fal++;
          System.out.print("¿El numero en el que piensas es mayor(+) o menor(-)?: ");
          det = (System.console().readLine());
          switch(det){
            case "+":
              min = num;
            break;
            case "-":
              max = num;
            break;
          }
        break;
      }
    }while((sol == 0) && (fal<5));
    if (fal==5){
      System.out.println("No pude adivinar el numero");
    }
  }
}

