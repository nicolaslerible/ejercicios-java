/*
 * @author Nicolás Lerible García
 * 
 * Presenta en pantalla una ficha con los datos de
 * un caballo "Rocinante"
 */
public class Ejercicio91 {
	
	public static void main (String args[]) {
		
    Caballo rocinante;
    
    rocinante = new Caballo("rocinante","macho");
    
    rocinante.setEdad(3);
    rocinante.setPeso(350);
    
    System.out.println(rocinante);
	}
}


