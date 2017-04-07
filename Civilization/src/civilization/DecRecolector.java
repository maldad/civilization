/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization;

/**
 *
 * @author maldad
 */
public class DecRecolector extends DecMejora {
    
  public DecRecolector(Oficio oficio){
    super(oficio);
  }

  @Override
  public void trabajar(Ciudadano c){
    oficio.trabajar(c);
    incrementaCapacidad(c);
  }
  
  public void incrementaCapacidad(Ciudadano c){
      System.out.println(c.getCapacidad());
      //c.setCapacidad(5);
      System.out.println(c.getCapacidad());
  }
}
