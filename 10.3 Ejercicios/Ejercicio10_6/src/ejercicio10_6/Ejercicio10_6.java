/*
 * Implementa el control de acceso al área restringida de un programa. Se debe
 * pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 * datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 * usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 * de usuario con sus correspondientes contraseñas deben estar almacenados
 * en una estructura de la clase HashMap.
 */
package ejercicio10_6;

import java.util.HashMap;
import java.util.Scanner;
/**
 * @author n.lerible.garcia
 */
public class Ejercicio10_6 {

    public static void main(String[] args) {
        HashMap<Integer, String> usu = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        int estado=0;
        String nom;
        int pas;
        boolean acceso=false;
        
        usu.put(001, "Alfa");
        usu.put(888, "Poker");
        usu.put(369, "Tesla");
        usu.put(999, "Ender");
        usu.put(115, "Zombie");
        
        do{
            System.out.print("Usuario: ");
            nom = scan.nextLine();
            System.out.print("Contraseña: ");
            pas = Integer.parseInt(scan.nextLine());
            
            if(usu.get(pas).equals(nom)){
                estado=4;
            }else{
                System.out.println("prueba de nuevo");
                estado++;
            }
            
            
        }while(estado<3);
        
        if(estado==4){
            System.out.println("Acceso concedido");
        }else if(estado==3){
            System.out.println("Acceso denegado");
        }
        
    }
    
}
