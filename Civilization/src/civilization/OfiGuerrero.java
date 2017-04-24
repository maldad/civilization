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
                //System.out.println("Camina de PuntoA a PuntoB");
                FrameCivilizacion.jTextArea5.append(b.getName() + " Camina de PuntoA a PuntoB \n");
            }
            else{
                //System.out.println("Camina de PuntoB a PuntoA");
                FrameCivilizacion.jTextArea5.append(b.getName() + " Camina de PuntoB a PuntoA \n");
            }
        }
        //System.out.println(b.getName()+ " termino su turno, irá a Dormir");
        //System.out.println(" ");
        //System.out.println("----------------------------------------------------------------------");
        //System.out.println(" ");
        FrameCivilizacion.jTextArea5.append(b.getName()+ " termino su turno, irá a Dormir");
        FrameCivilizacion.jTextArea5.append("\n");
        FrameCivilizacion.jTextArea5.append("----------------------------------------------------------------------");
        FrameCivilizacion.jTextArea5.append("\n");

    }
    
}
