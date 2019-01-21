
package funciones3;

public class otros{
  
  public static long Cifras(long n){
    long i=1;
    do{
      i=i*10;
    }while(i<n);
    return i;
  }
  
  public static boolean Curioseador(long n){
    long p = n*n;
    long c = Cifras(n);
    p = p%c;
    if(n==p){
      return true;
    }else{
      return false;
    }
  }
  
  
  
  
  
  
  
  
}
