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
public class OfiGuerrero implements Oficio {

    @Override
    public void trabajar(Ciudadano a) {
        CiudadanoGuerrero b=(CiudadanoGuerrero)a;
        for(int i=0;i<=b.getStamina();i++){
            if(i%2==0){
                System.out.println("Camina de PuntoA a PuntoB");
            }
            else{
                System.out.println("Camina de PuntoB a PuntoA");
            }
        }
        System.out.println(b.getName()+ " termino su turno, irá a Dormir");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");
    }
    
}
