
public class SueñoPremonitorio {
	
	public static void main (String args[]) {
		
    int i=0;
    String palabra = "ahora";
    char[] separado = palabra.toCharArray();
    for(i=0;i<palabra.length();i++){
      System.out.print(separado[i]+" ");
    }
    int numero = 365;
    int[] digitos = new int[3];
    for(i=2;i>=0;i--){
      digitos[i] = numero%10;
      numero=numero/10;
    }
    for(i=0;i<3;i++){
      System.out.print(digitos[i]+" ");
    }
	}
}

