
public class Cuadrado extends Figuras {
	
  //ATRIBUTOS
  int lado=0;
  //CONSTRUCTOR
  public Cuadrado(int l, String nom){
    super((l*l), (l*4), nom);
    this.lado = l;
  }
  
  //TOSTRING
  public String toString(){
    return this.getNombre()+"   area= "+this.getArea()+"   perimetro= "+this.getPerimetro();
  }
}

