
public class Fraccion {
	
  // atributos //////////
  int numerador;
  int denominador;
  // metodos ////////////
  Fraccion (int num, int den){
    this.numerador=num;
    this.denominador=den;
  }
  void mostrar(){
    System.out.println("Fracción: "+this.numerador+"/"+this.denominador);
  }
  void invertir(){
    System.out.println("Invertido: "+this.denominador+"/"+this.numerador);
  }
  void simplificar(){
    System.out.println("Simplificado: "+(this.numerador)/2+"/"+(this.denominador)/2);
  }
}

