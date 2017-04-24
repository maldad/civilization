/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization;

/**
 *
 * @author Zidai
 */
public class CiudadanoExplorador extends Ciudadano{
    private int stamina=5;
    public CiudadanoExplorador(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiExplorador();
    }
    public void mostrar(){
        //System.out.println(this.name+" comienza exploracion del Area... ");
        FrameCivilizacion.jTextArea6.append(this.name+" comienza exploracion del Area... ");
    }
    
    public int getStamina(){
        return stamina;
    }

    @Override
    public void setStamina(int s){
        stamina += s;
    }
    
    public void setOficio(Oficio o){
      oficio = o;
    }
    
    public Oficio getOficio(){
        return oficio;
    }
}
