
public class Caballo {
	// ATRIBUTOS /////////
  String raza;
  int edad;
  
  // METODOS ///////////
  
  // Constructor
  Caballo (String nom){
    this.raza=nom;
  }
  // Getter
  String getNombre(){
    return this.raza;
  }
  /*
   * Hace que el caballo corra
   */
  void corre(){
    System.out.println("El caballo empieza a correr");
  }
  
  
}

