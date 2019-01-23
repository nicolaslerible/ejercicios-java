//Subclase COCHE
public class Coche extends Vehiculo{
  
  //Atributos de subclase
  private int kmRecorridos;
  
  //Constructor
  public Coche(){
    vehCreados=vehCreados+1;
    this.kmRecorridos=0;
  }
  //Metodos de subclase
    //Hace que el coche queme rueda
  public void quemar(){
    System.out.println("Estas quemando rueda! Los vecinos van a llamar a la policia");
  }
    //Hace que el coche recorra x kilometros
  public void andar(){
    int recorrido = (int)(Math.random()*120+50);
    kmRecorridos=kmRecorridos+recorrido;
    kmTotal=kmTotal+recorrido;
    System.out.println("El coche ha recorrido "+recorrido+" km");
  }
    //Muestra el kilometraje del coche
  public int getKmRecorridos(){
    return kmRecorridos;
  }
  
}
