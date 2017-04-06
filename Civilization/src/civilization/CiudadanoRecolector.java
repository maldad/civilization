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
public class CiudadanoRecolector extends Ciudadano{
    private int capacidad= 10;
    public CiudadanoRecolector(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
        oficio= new OfiRecolector();
    }
    
    public void mostrar(){
        System.out.println("Recolectando... ");
    }
    
    public int getCapacidad(){
        return capacidad;
    }
}
