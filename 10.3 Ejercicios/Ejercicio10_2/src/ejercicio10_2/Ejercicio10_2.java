/*
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 */
package ejercicio10_2;

import java.util.ArrayList;
/**
 * @author n.lerible.garcia
 */
public class Ejercicio10_2 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int sum=0;
        int max=0;
        int min=100;
        for(int i=0;i<(int)(Math.random()*10)+10;i++){
            num.add((int)(Math.random()*100));
            sum+=num.get(i);
            if(num.get(i)>max){
                max=num.get(i);
            }
            if(num.get(i)<min){
                min=num.get(i);
            }
            System.out.print(num.get(i)+" ");
        }
        
        System.out.println("Suma: "+sum);
        System.out.println("Media: "+(sum/num.size()));
        System.out.println("Maximo: "+max);
        System.out.println("Minimo: "+min);
        
    }
    
}
