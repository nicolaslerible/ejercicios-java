
public class Ejercicio5 {
	
	public static void main (String args[]) {
		String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";
    
    System.out.println("      LUNES MARTES MIERCOLES JUEVES VIERNES");
    System.out.println("8:15   "+ verde +"S.I   "+ rojo +"Pro      "+ naranja +"EED      "+ naranja +"EED    "+ verde +"S.I");
    System.out.println(blanco +"9:15   "+ verde +"S.I   "+ rojo +"Pro      "+ naranja +"EED      "+ rojo +"Pro    "+ verde +"S.I");
    System.out.println(blanco +"10:15  "+ verde +"S.I   "+ rojo +"Pro      "+ blanco +"LM       "+ rojo +"Pro    "+ verde +"S.I");
    System.out.println("");
    System.out.println(blanco +"10:45  "+ azul +"FOL   "+ morado +"BBDD     "+ rojo +"Pro     "+ morado +"BBDD    "+ blanco+"LM");
    System.out.println("11:45  "+ azul +"FOL   "+ morado +"BBDD     "+ rojo +"Pro     "+ morado +"BBDD    "+ blanco+"LM");
    System.out.println("13:45  "+ azul +"FOL   "+ morado +"BBDD     "+ rojo +"Pro     "+ morado +"BBDD    "+ blanco+"LM");
	}
}

