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
        Civilizacion allBuilds = new CivEdificio("Ciudad", "Todos los Edificios de la Ciudad",3);
        
        Civilizacion almacen =new CivEdificio("ALMACEN", "Edifico para los Recolectores",10);
        Civilizacion armeria =new CivEdificio("ARMERIA", "Edifico para los Guerreros",10);
        Civilizacion torre   =new CivEdificio("CASA", "Edifico para los Exploradores",10);

        allBuilds.add(almacen);
        allBuilds.add(armeria);
        allBuilds.add(torre);
        
        almacen.add(new CiudadanoRecolector("Telemaco",10,10,10));
        almacen.add(new CiudadanoRecolector("Ulises",10,10,10));
        almacen.add(new CiudadanoRecolector("Penelope",10,10,10));
        
        armeria.add(new CiudadanoGuerrero("Lestat",15,30,25));
        armeria.add(new CiudadanoGuerrero("Mona",15,30,25));
        armeria.add(new CiudadanoGuerrero("Quinn",15,30,25));
        
        torre.add(new CiudadanoGuerrero("Edmont",20,15,20));
        torre.add(new CiudadanoGuerrero("Mercedes",20,15,20));
        torre.add(new CiudadanoGuerrero("Albert",20,15,20));
        
        Waitress waitress = new Waitress(allBuilds);
        waitress.printBuilds();
        
        System.out.println("\n#################\n#################\n");
        System.out.println(torre.getChild(1));
        System.out.println("Nombre: "+torre.getChild(1).getName()+" Vida: "+torre.getChild(1).getHp()+" Ataque: "+torre.getChild(1).getAtk()+" Defensa: "+torre.getChild(1).getDef());
        torre.getChild(1);
        
        Ciudadano rec1=new CiudadanoRecolector("Alex",10, 10, 10);
        System.out.println(rec1);
        //rec1.mostrar();
        //rec1.ejeOficio(rec1);
        /*
        Ciudadano exp1=new CiudadanoExplorador("Jhoana",10, 10, 10);
        exp1.mostrar();
        exp1.ejeOficio(exp1);
        
        Ciudadano gue1=new CiudadanoGuerrero("Alextrasda",10, 10, 10);
        gue1.mostrar();
        gue1.ejeOficio(gue1);*/
    }
    
}
