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
public abstract class DecMejora implements Oficio{
  protected Oficio oficio;    

  public DecMejora(Oficio o){
    oficio = o;
  }

  public void trabajar(Ciudadano c){
    oficio.trabajar(c);
  }

}
