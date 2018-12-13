
public class Examen1 {
	
	public static void main (String args[]) {
		
    int fin = 0;
    int i = 1;
    int sum = 0;
    int bin = 0;
    int dig = 1;
    int num = 0;
    System.out.print("Dime un numero entre 0 y 9999: ");
    num = Integer.parseInt(System.console().readLine());
    if ((num<0) || (num>9999)){
      System.out.println("Numero equivocado");
    }else {
      do {
        bin = num%2;
        sum = sum+num;
        num = num/2;
        if (bin==1){
          bin = bin*i;
        }else {
          bin = bin*i;
        }
        i = i*10;
        fin = fin+bin;
      }while(num>=1);
      System.out.println("en binario corresponde con: "+fin);
    }
	}
}

