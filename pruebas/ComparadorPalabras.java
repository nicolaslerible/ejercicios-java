
public class ComparadorPalabras {
	
	public static void main (String args[]) {
		
    String[] com = new String[1];
    com[0] = "salud";
    String[] pal = new String[1];
    System.out.println("comparo una palabra con la palabra'salud'.");
    System.out.print("Introduce una palabra: ");
    pal[0] = System.console().readLine();
    if(pal[0].equals(com[0])){
      System.out.println("Son palabras iguales");
    }
	}
}

