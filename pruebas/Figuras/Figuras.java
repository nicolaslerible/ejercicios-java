
public class Figuras {
	
  //ATRIBUTOS
  private double area;
  private int perimetro;
  private String nombre;
  
  //CONSTRUCTOR
  public Figuras(double a, int p, String n){
    this.area = a;
    this.perimetro = p;
    this.nombre = n;
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
  
  public String getNombre(){
    return this.nombre;
  }
}

