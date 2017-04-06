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
public class OfiRecolector implements Oficio {

    @Override
    public void trabajar(Ciudadano a) {
        CiudadanoRecolector b=(CiudadanoRecolector)a;
        for(int i=0;i<=b.getCapacidad();i++){
            if(i==b.getCapacidad()){
                System.out.println("Lleno, Regresando al almacen..");
                System.out.println(" ");
                System.out.println("----------------------------------------------------");
                System.out.println(" ");
            }
        }
        
    }
    
}
