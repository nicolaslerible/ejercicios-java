
public class Pizza {
	
  //Atributos
  private int totalPedidas;
  private int totalServidas;
  private String tamano;
  private String tipo;
  
  //Constructor
  public Pizza(String ti, String ta){
    this.tipo=ti;
    this.tamano=ta;
    setTotalPedidas();
  }
  
  //Getter Setter
  public void setTotalPedidas(){
    totalPedidas=totalPedidas+1;
  }
  public int getTotalPedidas(){
    return totalPedidas;
  }
  
  public void setTotalServidas(){
    totalServidas=totalServidas+1;
  }
  public int getTotalServidas(){
    return totalServidas;
  }
  
  //Metodos
  
  public void servir(){
    setTotalServidas();
  }
  
}

