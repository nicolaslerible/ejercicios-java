
public class Triangulo extends Figuras{
	
  //ATRIBUTOS
  int base;
  int altura;
  
  //CONSTRUCTOR
  public Triangulo(int b, int h){
    super(((b*h)/2),(b*3));
    this.base = b;
    this.altura = h;
  }
  
  //TOSTRING
  public String toString(){
    return "area= "+this.getArea()+"   perimetro= "+this.getPerimetro();
  }
}

