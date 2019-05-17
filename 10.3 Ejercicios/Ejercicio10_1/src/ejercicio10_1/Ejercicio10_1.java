/*
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */

package ejercicio10_1;
import java.util.ArrayList;
/**
 * @author n.lerible.garcia
 */
public class Ejercicio10_1 {

    public static void main(String[] args) {
        
        ArrayList<String> compa = new ArrayList<String>();

        compa.add("Samuel");
        compa.add("Miguel");
        compa.add("Julián");
        compa.add("Rafa");
        compa.add("Fran");
        compa.add("David");
        
        for(int i=0;i<compa.size();i++){
            System.out.println(compa.get(i));    
        }
        
    }
    
}
