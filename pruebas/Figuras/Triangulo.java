
public class Triangulo extends Figuras{
	
  //ATRIBUTOS
  int base;
  int altura;
  
  //CONSTRUCTOR
  public Triangulo(int b, int h, String nom){
    super(((b*h)/2),(b*3), nom);
    this.base = b;
    this.altura = h;
  }
  
  //TOSTRING
  public String toString(){
    return this.getNombre()+"   area= "+this.getArea()+"   perimetro= "+this.getPerimetro();
  }
}

