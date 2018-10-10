public class Ejercicio34 {
	
	public static void main (String args[]) {
    String line;
    System.out.println("dime un numero: x=");
    line = System.console().readLine();
    double x;
    x = Integer.parseInt(line);
    
    System.out.println("dime otro numero: y=");
    line = System.console().readLine();
    double y;
    y = Integer.parseInt(line);
    double sum = x + y;
    double res = x - y;
    double mul = x * y;
    double div = x / y;
    System.out.println("x =" + x + "   y =" + y);
    System.out.println("x + y =" + sum + "   x - y =" + res);
		System.out.println("x * y =" + mul + "   x / y =" + div);
	}
}

