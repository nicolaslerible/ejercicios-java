/*
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 */
package ejercicio10_3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author n.lerible.garcia
 */
public class Ejercicio10_3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Introduce 10 numeros y te los ordeno");
        int num;
        int hero;
        for(int i=0;i<2;i++){
            System.out.print("Introduce un numero: ");
            num = Integer.parseInt(scan.nextLine());
        }

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i));
        }       

    }

}
