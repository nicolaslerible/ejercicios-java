
public class Pizza {
	
  //Atributos
  private static int totalPedidas=0;
  private static int totalServidas=0;
  private String tamano;
  private String tipo;
  private String estado;
  
  //Constructor
  public Pizza(String ti, String ta){
    this.tipo=ti;
    this.tamano=ta;
    this.estado="pedida";
    Pizza.totalPedidas++;
  }
  
  //Getter
  public static int getTotalPedidas(){
    return totalPedidas;
  }
  
  public static int getTotalServidas(){
    return totalServidas;
  }
  
  //Metodos
  
  public void sirve(){
    if(this.estado.equals("pedida")){
      this.estado="servida";
      Pizza.totalServidas++;
    }else{
      System.out.println("Esa pizza ya se ha servido");
    }
  }
  
  public String toString(){
    return "pizza "+this.tipo+" "+this.tamano+", "+this.estado;
  }
}

