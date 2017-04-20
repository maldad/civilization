/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization;

import java.util.logging.Level;
import java.util.logging.Logger;

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
                //System.out.println(b.getName() + " No puede cargar mas, regresara al almacen..");
                FrameCivilizacion.jTextArea4.append(b.getName() + " No puede cargar mas, regresara al almacen..\n");
                //System.out.println(" ");
                FrameCivilizacion.jTextArea4.append(" \n");
                //System.out.println("----------------------------------------------------------------------");
                FrameCivilizacion.jTextArea4.append("----------------------------------------------------------------------\n");
                //System.out.println(" ");
                FrameCivilizacion.jTextArea4.append(" \n");
            }else{
                try {
                    Thread.sleep(b.getRetraso());
                } catch (InterruptedException ex) {
                    Logger.getLogger(b.getName(), null);
                }
                //System.out.println("Recolectando... " + (i+1)+ " de " +b.getCapacidad() );
                FrameCivilizacion.jTextArea4.append("Recolectando... " + (i+1)+ " de " +b.getCapacidad()+"\n");
            }
        }
    }
}
