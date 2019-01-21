import Consola.Funciones;

public class Ex16nlg3 {
	
	public static void main (String args[]) {
		
    System.out.print("Introduce el precio del artículo: ");
    double precio = Double.parseDouble(System.console().readLine());
    System.out.print("Indica el numero de unidades: ");
    int unidades = Integer.parseInt(System.console().readLine());
    System.out.print("Indica el codigo de descuentro: ");
    int codigo = Integer.parseInt(System.console().readLine());
    double descuento = Funciones.listaCodigos(codigo, unidades, precio);
    System.out.println("A continuación se le muestra el precio desglosado del pedido:");
    System.out.println("-----------------------------------------------");
    System.out.println("Precio del artículo:                  "+precio+"€");
    System.out.println("Numero de unidades:                   "+unidades);
    System.out.println("Precio total unidades:                "+(precio*unidades)+"€");
    System.out.print("Descuento aplicado: ");
    if(descuento==0){
      System.out.println("Codigo no valido: "+descuento+"€");
    }else{
      System.out.println("Codigo: "+codigo+"       "+descuento+"€");
    }
    System.out.println("Precio con descuento:                 "+(precio*unidades-descuento)+"€");
    System.out.println("IVA (21%):                            "+((precio*unidades-descuento)*0.21)+"€");
    System.out.println("-----------------------------------------------");
    System.out.println("PRECIO FINAL:                         "+((precio*unidades-descuento)+((precio*unidades-descuento)*0.21))+"€");
    
	}
}

