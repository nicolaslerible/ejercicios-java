package Consola;

public class Funciones {
	
	public static double listaCodigos(int cod, int uni, double pre){
		
    if(cod==685){
      return 15;
    }else if(cod==778){
      if(uni<20){
        return (pre*uni*0.05);
      }else{
        return (pre*20*0.05);
      }
    }else if(cod==219){
      if(uni>5){
        return (pre*5);
      }else{
        return 0;
      }
    }else{
      return 0;
    }
    
    
    
	}
}

