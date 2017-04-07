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
    c.setCapacidad(5);
    oficio.trabajar(c);
  }

}
