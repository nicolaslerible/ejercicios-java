
public class Numeros {
	
	public static void main (String args[]) {
		
    int line;
    int num1 = 0;
    int num2 = 0;
    int num3 = 0;
    int con = 0;
    do {
      
      for (line=0;line<=5;line++) {
        num1++;
        if (num1==3) {
          System.out.print(num3+"-"+num2+"-E ");
        }else if (num1>9){
          num1=0;
          num2++;
        }else if (num2==3) {
          System.out.print(num3+"-E-"+num1+" ");
        }else if (num2>9){
          num2=0;
          num3++;
        }else if (num3==3) {
          System.out.print("E-"+num2+"-"+num1+" ");
        }else if (num2>9){
          num3=0;
        }else { 
          System.out.print(num3+"-"+num2+"-"+num1+" ");
        }
        con++;
      } 
    }while (con<997);
	}
}

