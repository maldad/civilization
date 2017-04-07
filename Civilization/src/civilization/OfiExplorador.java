/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civilization;

import java.util.Random;

/**
 *
 * @author maldad
 */
public class OfiExplorador implements Oficio {

    @Override
    public void trabajar(Ciudadano a) {
        Random rand=new Random();
        CiudadanoExplorador b=(CiudadanoExplorador)a;
        for(int i=0;i<=b.getStamina();i++){
            int posi= rand.nextInt(100);
            if(posi<5){
                System.out.println("ENEMIGO ENCONTRADO!!");
            }
            if(posi>95){
                System.out.println("Aliando Encontrado!!");
            }
        }
        System.out.println(b.getName()+" acampará para descansar...");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------");
        System.out.println(" ");
    }
    
}
