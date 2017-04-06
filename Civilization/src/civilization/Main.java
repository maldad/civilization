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
public class Main {
    public static void main(String[] args){
        Ciudadano rec1=new CiudadanoRecolector(10, 10, 10);
        rec1.mostrar();
        rec1.ejeOficio(rec1);
        
        Ciudadano exp1=new CiudadanoExplorador(10, 10, 10);
        exp1.mostrar();
        exp1.ejeOficio(exp1);
        
        Ciudadano gue1=new CiudadanoGuerrero(10, 10, 10);
        gue1.mostrar();
        gue1.ejeOficio(gue1);
        
       
    }
    
}
