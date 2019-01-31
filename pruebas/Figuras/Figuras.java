
public class Figuras {
	
  //ATRIBUTOS
  private double area;
  private int perimetro;
  
  //CONSTRUCTOR
  public Figuras(double a, int p){
    this.area = a;
    this.perimetro = p;
  }
  //OPERACIONES AREA
  public double getArea(){
    return this.area;
  }
  public void setArea(int a){
    this.area = a;
  }
  //OPERACIONES PERIMETRO
  public int getPerimetro(){
    return this.perimetro;
  }
  public void setPerimetro(int p){
    this.perimetro = p;
  }
}

