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
        Civilizacion almacen =new CivEdificio("ALMACEN", "Edifico para los Recolectores",10);
        Civilizacion armeria =new CivEdificio("ARMERIA", "Edifico para los Guerreros",10);
        Civilizacion torre =new CivEdificio("CASA", "Edifico para los Exploradores",10);
        
        Civilizacion allBuilds = new CivEdificio("Ciudad", "Todos los Edificios de la Ciudad",3);

        allBuilds.add(almacen);
        allBuilds.add(armeria);
        allBuilds.add(torre);
        
        almacen.add(new CiudadanoRecolector("Dantes",10,10,10));
        
        Waitress waitress = new Waitress(allBuilds);

        waitress.printBuilds();
        
        Ciudadano rec1=new CiudadanoRecolector("Alex",10, 10, 10);
        rec1.mostrar();
        rec1.ejeOficio(rec1);
        
        Ciudadano exp1=new CiudadanoExplorador("Jhoana",10, 10, 10);
        exp1.mostrar();
        exp1.ejeOficio(exp1);
        
        Ciudadano gue1=new CiudadanoGuerrero("Alextrasda",10, 10, 10);
        gue1.mostrar();
        gue1.ejeOficio(gue1);
    }
    
}
