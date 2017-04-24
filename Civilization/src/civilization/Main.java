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
    static Civilizacion allBuilds = new CivEdificio("Ciudad", "Todos los Edificios de la Ciudad",3);   
    static Civilizacion almacen =new CivEdificio("ALMACEN", "Edifico para los Recolectores",10);
    static Civilizacion armeria =new CivEdificio("ARMERIA", "Edifico para los Guerreros",10);
    static Civilizacion torre   =new CivEdificio("CASA", "Edifico para los Exploradores",10);
    
    public static void agregar(){
        allBuilds.add(almacen);
        allBuilds.add(armeria);
        allBuilds.add(torre);
        
        almacen.add(new CiudadanoRecolector("Telemaco",10,10,10));
        almacen.add(new CiudadanoRecolector("Ulises",10,10,10));
        almacen.add(new CiudadanoRecolector("Penelope",10,10,10));
        
        armeria.add(new CiudadanoGuerrero("Lestat",15,30,25));
        armeria.add(new CiudadanoGuerrero("Mona",15,30,25));
        armeria.add(new CiudadanoGuerrero("Quinn",15,30,25));
        
        torre.add(new CiudadanoExplorador("Edmont",20,15,20));
        torre.add(new CiudadanoExplorador("Mercedes",20,15,20));
        torre.add(new CiudadanoExplorador("Albert",20,15,20));
        
        Waitress waitress = new Waitress(allBuilds);
        waitress.printBuilds();
    }
    
    public static void iniciar(){
        CiudadanoRecolector rec1= (CiudadanoRecolector)almacen.getChild(0);
        rec1.mostrar();
        rec1.setOficio(new DecRecolector(rec1.getOficio()));
        rec1.ejeOficio(rec1);
        
        CiudadanoRecolector rec2= (CiudadanoRecolector)almacen.getChild(1);
        rec2.mostrar();
        rec2.ejeOficio(rec2);
        
        CiudadanoRecolector rec3= (CiudadanoRecolector)almacen.getChild(2);
        rec3.mostrar();
        rec3.ejeOficio(rec3);
        
        CiudadanoGuerrero gue1= (CiudadanoGuerrero)armeria.getChild(0);
        gue1.mostrar();
        gue1.setOficio(new DecGuerrero(gue1.getOficio()));
        gue1.ejeOficio(gue1);
        
        CiudadanoGuerrero gue2= (CiudadanoGuerrero)armeria.getChild(1);
        gue2.mostrar();
        gue2.ejeOficio(gue2);
        
        CiudadanoGuerrero gue3= (CiudadanoGuerrero)armeria.getChild(2);
        gue3.mostrar();
        gue3.ejeOficio(gue3);

        
        CiudadanoExplorador exp1= (CiudadanoExplorador)torre.getChild(0);
        exp1.mostrar();
        exp1.setOficio(new DecExplorador(exp1.getOficio()));
        exp1.ejeOficio(exp1);
        
        CiudadanoExplorador exp2= (CiudadanoExplorador)torre.getChild(1);
        exp2.mostrar();
        exp2.ejeOficio(exp2);
        
        CiudadanoExplorador exp3= (CiudadanoExplorador)torre.getChild(2);
        exp3.mostrar();
        exp3.ejeOficio(exp3);
    } 
}
