public class Caballo {
	// ATRIBUTOS ////////
  String raza;
  String nombre;
  boolean sexo; //false macho, true hembra
  int peso;
  int edad;
  
  // METODOS //////////
  Caballo (String name, String sex) {
    this.nombre = name;
    if (sex.equals("macho")){
      this.sexo = false;
    }else {
      this.sexo = true;
    }
    this.edad = -1;
    this.peso = -1;
    this.raza = "";
  }
  String getNombre (){
    return this.nombre;
  }
  
  void setEdad (int time){
    this.edad = time;
  }
  int getEdad (){
    return this.edad;
  }
  
  void setPeso (int pes){
    this.peso = pes;
  }
  int getPeso (){
    return this.peso;
  }
  
  public String toString() {
    String ficha;
    ficha = "Nombre: "+this.nombre+"\n";
    if (this.sexo == true){
      ficha += "Sexo: hembra\n";
    }else {
      ficha += "Sexo: macho\n";
    }
    if (!this.raza.equals("")){
      ficha += "Raza: "+this.raza+"\n";
    }
    if (this.edad >=0){
      ficha +="Edad: "+this.edad+"\n";
    }
    if (this.peso >=0){
      ficha +="Peso: "+this.peso+"\n";
    }
    return ficha;
  }
  
  
  
}
