
public class Tiempo {
	
  //Atributos
  private int horas;
  private int minutos;
  private int segundos;
  
  //Constructor
  public Tiempo(int h, int m, int s){
    this.horas=h;
    this.minutos=m;
    this.segundos=s;
  }
  
  //Metodos
  public static void sumar(Tiempo t1, Tiempo t2){
    System.out.println("Suma: "+(t1.horas+t2.horas)+"h "+(t1.minutos+t2.minutos)+"m "+(t1.segundos+t2.segundos)+"s");
  }
  
  public static void restar(Tiempo t1, Tiempo t2){
    System.out.println("Resta: "+(t1.horas-t2.horas)+"h "+(t1.minutos-t2.minutos)+"m "+(t1.segundos-t2.segundos)+"s");
  }
  
  public String toString(){
    return this.horas+"h "+this.minutos+"m "+this.segundos+"s";
  }
}

