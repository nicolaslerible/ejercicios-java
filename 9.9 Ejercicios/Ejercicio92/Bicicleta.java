//Subclase Bicicleta
public class Bicicleta extends Vehiculo{
  
  //Atributos de subclase
  private int kmRecorridos;
  
  //Constructor
  public Bicicleta(){
    vehCreados=vehCreados+1;
    this.kmRecorridos=0;
  }
  //Metodos de subclase
    //Hace el caballito con la bicicleta
  public void caballito(){
    System.out.println("Has hecho el caballito! Estas hecho todo un deportista");
  }
    //Hace que la bicicleta recorra x kilometros
  public void andar(){
    int recorrido = (int)(Math.random()*15+5);
    kmRecorridos=kmRecorridos+recorrido;
    kmTotal=kmTotal+recorrido;
    System.out.println("La bicicleta ha recorrido "+recorrido+" km");
  }
    //Muestra el kilometraje de la bicicleta
  public int getKmRecorridos(){
    return kmRecorridos;
  }
}
