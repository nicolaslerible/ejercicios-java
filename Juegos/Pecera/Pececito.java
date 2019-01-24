
public class Pececito {
	
  //Atributos
  int posx=0;
  int posy=0;
  char[][] pez = new char[5][8];
  public Pececito(){
    posx=0;
    posy=0;
    for(int i=0;i<5;i++){
      for(int j=0;j<8;j++){
        pez[i][j]='·';
      }
    }
    pez[posx][posy]='&';
  }
  public void nadar(){
    /*
    int movx = (int)(Math.random()*4-2);
    int movy = (int)(Math.random()*4-2);
    */
    int movx = (int)(Math.random()*3)-1;
    int movy = (int)(Math.random()*3)-1;
    pez[posx][posy]='·';
    if((posx==0)&&(movx!=0)){
      posx++;
    }else if((posx==4)&&(movx!=0)){
      posx--;
    }else if((posy==0)&&(movy!=0)){
      posy++;
    }else if((posy==7)&&(movy!=0)){
      posy--;
    }else{
      posx=posx+movx;
      posy=posy+movy;
    }
    //if((posx)||(posy))
    pez[posx][posy]='&';
    for(int i=0;i<5;i++){
      for(int j=0;j<8;j++){
        System.out.print(pez[i][j]);
      }
      System.out.println();
    }
    
  }
  
}

