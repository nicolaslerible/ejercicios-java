
public class Cuadrado extends Figuras {
	
  //ATRIBUTOS
  int lado=0;
  
  //CONSTRUCTOR
  public Cuadrado(int l){
    super((l*l), (l*4));
    this.lado = l;
  }
  
  //TOSTRING
  public String toString(){
    return "area= "+this.getArea()+"   perimetro= "+this.getPerimetro();
  }
}

