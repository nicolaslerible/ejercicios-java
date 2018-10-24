
public class Ejercicio61 {
	
	public static void main (String args[]) {
		
    int sum = 0;
    for (int i=1;i<=3;i++) {
    int dado=(int)(Math.random()*6)+1;
    System.out.println("dado "+i+": "+dado);
    sum = sum+dado;
    }
    System.out.println("suma: "+sum);
	}
}

