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
public class DecGuerrero extends DecMejora {

  public DecGuerrero(Oficio oficio){
    super(oficio);
  }

  @Override
  public void trabajar(Ciudadano c){
    c.setStamina(5);
    oficio.trabajar(c);
  }

  /*
  public void incrementaStamina(Oficio o){
    //System.out.println(c.getStamina());
    //c.setStamina(5);
    o.trabajar(Ciudadano c);
    //System.out.println(c.getStamina());
  }
*/
}
