
package matematicas;

public class varios{
  
  public static int Voltear(int n){
    int i = 1;
    int s = 0;
    int bus = 0;
    int dig;
    int pot = 1;
    dig = Digitos(n);
    pot = Potencia(10, dig)/10;
    do{
    bus = n/(pot/i);
    n = n-(bus*(pot/i));
    s = s+(bus*i);
    i = i*10;
    }while(n != 0);
    return s;
  }
  
  public static int Digitos(int n){
    int i = 1;
    int d = 0;
    do{
      i=i*10;
      d++;
    }while(i<n);
    return d;
  }
  public static int Potencia(int n, int e){
    int p = 1;
    for(int i=0;i<e;i++){
      p = p*n;
    }
    return p;
  }
  public static boolean Capicua(int n){
    int vol = Voltear(n);
    if(vol==n){
      return true;
    }else{
      return false;
    }
  }
  /*Dados un numero "n" y un digito "d" determina
   * la posición de dicho digito*/
  public static int PosicionDeDigito(int n, int d){
    int dig = Digitos(n);
    int c = 0;
    int i = 0;
    do{
      c = DigitoN(n, (dig-i));
      i++;
    }while((c != d) && (i < dig));
    if(c==d){
      return i;
    }else{
      return -1;
    }
  }
  
  public static int DigitoN(int n, int p){
    int pot = Potencia(10, p-1);
    int c = n/pot;
    c = c%10;
    return c;
  }
  
  public static boolean EsPrimo(int n){
    int con = 0;
    for(int i=1;i<n;i++){
      int det = n%i;
      if(det==0){
        con++;
      }
    }
    if(con<=1){
      return true;
    }else{
      return false;
    }
  }
  
  public static int SiguientePrimo(int n){
    int d=0;
    do{
      n=n+1;
      if(EsPrimo(n)){
        d++;
      }
    }while(d<1);
    return n;
  }
  
  public static int QuitaPorDetras(int n, int d){
    d=Potencia(10, d);
    n=n/d;
    return n;
  }
  
  public static int QuitaPorDelante(int n, int d){
    d=Potencia(10, Digitos(n)-d);
    n=n%d;
    return n;
  }
  
  public static int PegaPorDetras(int n, int d){
    n=(n*10)+d;
    return n;
  }
  
  public static int PegaPorDelante(int n, int d){
    n=(n*10)+d;
    return n;
  }
  public static int TrozoDeNumero(int n, int i, int f){
    i = Potencia(10, i)/10;
    f = Potencia(10, f);
    n = (n/i)%(f/i);
    return n;
  }
  
  public static int JuntaNumeros(int n, int m){
    n = n*Potencia(10, Digitos(m))+m;
    return n;
  }
}
