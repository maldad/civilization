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
    private int stamina=10;
    public CiudadanoExplorador(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiExplorador();
    }
    public void mostrar(){
        System.out.println("Explorando Area... ");
    }
    
    public int getStamina(){
        return stamina;
    }
}
